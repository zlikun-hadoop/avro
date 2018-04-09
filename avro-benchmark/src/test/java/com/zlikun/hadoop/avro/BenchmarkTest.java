package com.zlikun.hadoop.avro;

import org.apache.avro.io.*;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 基准测试（性能），本例仅针对小数据量的测试
 *
 * 整体来看，Avro性能比PB3差很多，在本测试用例中有大约2 ~ 4倍的差距，另外Avro测试过程中CPU飙高到100%，而同等测试下PB3对CPU影响非常小(几乎看不出来)
 * @author zlikun <zlikun-dev@hotmail.com>
 * @date 2018-04-09 13:56
 */
public class BenchmarkTest {

    private long time ;

    @Before
    public void init() {
        time = System.currentTimeMillis();
    }

    @After
    public void destroy() {
        System.out.println(String.format("程序执行耗时：%d 毫秒!", System.currentTimeMillis() - time));
    }

    /**
     * 下面是连续5次测试(100万次循环)的结果
     * 6591 / 5961 / 6271 / 6428 / 6203
     * 字节数大小会影响测试结果
     * @throws IOException
     */
    @Test
    public void single() throws IOException {

        // 单线程，100万次循环测试
        for (long i = 0; i < 1_000_000; i++) {
            execute(i + 1);
        }

    }

    /**
     * 下面是连续5次测试(100万次循环)的结果
     * 4938 / 4531 / 5921 / 4420 / 4977
     * @throws IOException
     */
    @Test
    public void multi() throws IOException {

        ExecutorService exec = Executors.newFixedThreadPool(20);

        // 多线程，100万次循环测试
        for (long i = 0; i < 1_000_000; i++) {
            long id = i + 1;
            exec.execute(() -> {
                try {
                    execute(id);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }

        exec.shutdown();
        while (!exec.isTerminated());

    }

    /**
     * 执行序列化、反序列化
     * @param id
     * @throws IOException
     */
    private void execute(long id) throws IOException {
        // 准备数据
        User user = User.newBuilder()
                .setId(id)
                .setName("zlikun_" + id)
                .setActive(id % 2 == 0)
                // 100个字节，避免测试数据过小
                .setRemark("0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789")
                .build();

        // 序列化，这里直接使用字节传输，不使用文件、网络等(传输部分与序列化协议无关)
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DatumWriter<User> writer = new SpecificDatumWriter<>(User.class);
        Encoder encoder = EncoderFactory.get().binaryEncoder(out, null);
        writer.write(user, encoder);
        encoder.flush();
        out.close();
        byte [] data = out.toByteArray();

        // 读取数据，反序列化
        DatumReader<User> reader = new SpecificDatumReader<>(User.class);
        Decoder decoder = DecoderFactory.get().binaryDecoder(data, null);
        reader.read(null, decoder);
    }

}
