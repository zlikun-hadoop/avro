package com.zlikun.hadoop.color;

import com.zlikun.hadoop.avro.User;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumWriter;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * 生成测试数据，教程网站上是Ruby脚本生成的，测试服务器上无对应环境
 * @author zlikun <zlikun-dev@hotmail.com>
 * @date 2018-04-08 16:31
 */
public class ColorDataGenerator {

    @Test
    public void generate() throws IOException {

        DatumWriter<User> datumWriter = new SpecificDatumWriter<>(User.class);
        DataFileWriter<User> fileWriter = new DataFileWriter<>(datumWriter);
        fileWriter.create(User.getClassSchema(), new File("target/users.avro"));
        // 写入数据
        fileWriter.append(new User("one", "red"));
        fileWriter.append(new User("two", "green"));
        fileWriter.append(new User("three", "purple"));
        fileWriter.append(new User("four", "green"));
        fileWriter.append(new User("five", "blue"));
        fileWriter.append(new User("six", "red"));
        fileWriter.append(new User("seven", "green"));
        fileWriter.append(new User("eight", "yellow"));
        fileWriter.append(new User("nine", "green"));
        fileWriter.append(new User("ten", "purple"));
        // 关闭文件流
        fileWriter.close();

        System.out.println("Avro data file generate complete .");
    }

}
