package com.zlikun.hadoop.avro;

import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

/**
 * @author zlikun <zlikun-dev@hotmail.com>
 * @date 2018-04-08 14:55
 */
public class UserTest {

    @Test
    public void test() throws IOException {

        // 使用构造器构造
        User model = User.newBuilder()
                .setBirthday(LocalDate.of(2000, 1, 1).toEpochDay())
                .setFavoriteColor("GREEN")
                .setFavoriteNumber(7)
                .setId(10086L)
                .setName("Jane")
                .build();

        // 使用构造方法构造
        User model2 = new User(
                10000L,
                "Ashe",
                LocalDate.of(1997, 12, 31).toEpochDay(),
                3,
                "BLUE");

        // 使用setter构造
        User model3 = new User();
        model3.setId(12306L);
        model3.setBirthday(LocalDate.of(2012, 12, 12).toEpochDay());
        model3.setFavoriteColor("PURPLE");
        model3.setFavoriteNumber(9);
        model3.setName("Alice");

        // 执行序列化( 写入文件 )
        DatumWriter<User> datumWriter = new SpecificDatumWriter<>(User.class);
        DataFileWriter<User> fileWriter = new DataFileWriter<>(datumWriter);
        fileWriter.create(model.getSchema(), new File("target/users.avro"));
        fileWriter.append(model);
        fileWriter.append(model2);
        fileWriter.append(model3);
        fileWriter.close();

        // 执行反序列化( 读取文件 )，这里的 User.getClassSchema() 与 User.class 在效果上等效
        DatumReader<User> datumReader = new SpecificDatumReader<>(User.getClassSchema());
        DataFileReader<User> fileReader = new DataFileReader<User>(new File("target/users.avro"), datumReader);
        User user = null;
        while (fileReader.hasNext()) {
            user = fileReader.next();
            System.out.println(user);
        }
        fileReader.close();

    }

}
