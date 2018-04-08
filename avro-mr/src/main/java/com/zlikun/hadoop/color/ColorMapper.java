package com.zlikun.hadoop.color;

import com.zlikun.hadoop.avro.User;
import org.apache.avro.mapred.AvroKey;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

/**
 *
 * @author zlikun <zlikun-dev@hotmail.com>
 * @date 2018-04-08 15:58
 */
public class ColorMapper extends Mapper<AvroKey<User>, NullWritable, Text, IntWritable> {

    @Override
    protected void map(AvroKey<User> key, NullWritable value, Context context) throws IOException, InterruptedException {

        CharSequence color = key.datum().getFavoriteColor();

        if (color == null) color = "none";

        // 根据幸运色对用户做映射
        context.write(new Text(color.toString()), new IntWritable(1));

    }

}
