package com.zlikun.hadoop.avro;

import org.apache.avro.io.*;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.avro.util.Utf8;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * 使用 avro-maven-plugin 插件生成 StringPair 类
 * @author zlikun <zlikun-dev@hotmail.com>
 * @date 2018-04-08 14:27
 */
public class StringPairTest {

    @Test
    public void test() throws IOException {

        // 准备数据(不再需要 Schema 文件，已经隐式包含)
        StringPair datum = new StringPair();
        datum.setLeft("左青龙");
        datum.setRight("右白虎");

        // 序列化
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DatumWriter<StringPair> writer = new SpecificDatumWriter<>(StringPair.class);
        Encoder encoder = EncoderFactory.get().binaryEncoder(out, null);
        writer.write(datum, encoder);
        encoder.flush();
        out.close();

        // 该字节数组即可用于网络传输
        byte [] data = out.toByteArray();
//        assertEquals(20, data.length);

        // 反序列化
        DatumReader<StringPair> reader = new SpecificDatumReader<>(StringPair.class);
        Decoder decoder = DecoderFactory.get().binaryDecoder(data, null);
        StringPair record = reader.read(null, decoder);

        // 断言，avro-1.7.x版本存在如下问题：
        // org.apache.avro.util.Utf8 cannot be cast to java.lang.String
        assertEquals(new Utf8("左青龙"), record.getLeft());
        assertEquals(new Utf8("右白虎"), record.getRight());

    }

}
