package com.zlikun.hadoop.avro;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.*;
import org.apache.avro.specific.SpecificDatumWriter;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

/**
 * 不生成Java实体类进行数据传输
 * @author zlikun <zlikun-dev@hotmail.com>
 * @date 2018-04-08 15:14
 */
public class GenericRecordTest {

    @Test
    public void test() throws IOException {

        // User.getClassSchema() -> 这里原本应通过文件读取Schema信息，这里仅作演示，使用了User类的Schema定义
        Schema schema = User.getClassSchema();

        GenericRecord record = new GenericData.Record(schema);
        record.put("id", 10000L);
        record.put("name", "zlikun");
        record.put("birthday", LocalDate.of(1999 ,10, 1).toEpochDay());
        record.put("favorite_number", 7);
        record.put("favorite_color", null);

        // 执行序列化
        DatumWriter<GenericRecord> datumWriter = new SpecificDatumWriter<>(schema);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Encoder encoder = EncoderFactory.get().binaryEncoder(out, null);
        datumWriter.write(record, encoder);
        encoder.flush();

        // 生成的字节数组
        byte [] data = out.toByteArray();
        assertEquals(16, data.length);

        // 执行反序列化
        DatumReader<GenericRecord>  datumReader = new GenericDatumReader<>(schema);
        Decoder decoder = DecoderFactory.get().binaryDecoder(data, null);
        GenericRecord record2 = datumReader.read(null, decoder);

        // {"id": 10000, "name": "zlikun", "birthday": 10865, "favorite_number": 7, "favorite_color": null}
        System.out.println(record2);

    }

}
