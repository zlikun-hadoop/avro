package com.zlikun.hadoop.api;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.*;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * 使用 .avsc 文件进行序列化、反序列化操作
 * @author zlikun <zlikun-dev@hotmail.com>
 * @date 2018-04-08 14:30
 */
public class AvroTest {

    @Test
    public void test() throws IOException {

        // 获取Schema信息
        Schema.Parser parser = new Schema.Parser();
        // 通过一个schema文件来生成Schema对象，这样就不需要生成对应实体类
        Schema schema = parser.parse(AvroTest.class.getClassLoader().getResourceAsStream("StringPair.avsc"));

        // 创建一个Avro记录实例
        GenericRecord datum = new GenericData.Record(schema);
        datum.put("left", "左青龙");
        datum.put("right", "右白虎");

        // 序列化
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        // DatumWriter将对象数据翻译成Encoder对象可以理解的类型
        DatumWriter<GenericRecord> writer = new GenericDatumWriter<>(schema);
        // 再由Encoder对象写入输出流
        Encoder encoder = EncoderFactory.get().binaryEncoder(out, null);
        writer.write(datum, encoder);
        encoder.flush();
        out.close();

        // 该字节数组即可用于网络传输
        byte [] data = out.toByteArray();
        assertEquals(20, data.length);

        // 反序列化
        DatumReader<GenericRecord> reader = new GenericDatumReader<>(schema);
        Decoder decoder = DecoderFactory.get().binaryDecoder(data, null);
        GenericRecord record = reader.read(null, decoder);

        // 断言
        assertThat(record.get("left").toString(), is("左青龙"));
        assertThat(record.get("right").toString(), is("右白虎"));

    }

}
