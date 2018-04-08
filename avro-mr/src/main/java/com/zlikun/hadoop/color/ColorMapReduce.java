package com.zlikun.hadoop.color;

import com.zlikun.hadoop.avro.User;
import org.apache.avro.Schema;
import org.apache.avro.mapreduce.AvroJob;
import org.apache.avro.mapreduce.AvroKeyInputFormat;
import org.apache.avro.mapreduce.AvroKeyValueOutputFormat;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

import java.io.File;

/**
 * 按幸运色统计用户数
 * http://avro.apache.org/docs/current/mr.html
 * http://hadooptutorial.info/avro-mapreduce-2-api-example/
 * @author zlikun <zlikun-dev@hotmail.com>
 * @date 2018-04-08 16:03
 */
public class ColorMapReduce extends Configured implements Tool {

    @Override
    public int run(String[] args) throws Exception {

        // 测试准备数据
        // $ hdfs dfs -mkdir -p /example/user/color/input
        // $ hdfs dfs -put users.avro /example/user/color/input
        // $ hdfs dfs -du -h /example/user/color/input
        // 361  /example/user/color/input/users.avro
        Job job = Job.getInstance(this.getConf());
        job.setJar(new File("avro-mr/target/mr.jar").getAbsolutePath());
        job.setJobName("color");

        FileInputFormat.setInputPaths(job, new Path("/example/user/color/input"));
        FileOutputFormat.setOutputPath(job, new Path("/example/user/color/output/" + System.currentTimeMillis()));

        job.setInputFormatClass(AvroKeyInputFormat.class);
        job.setMapperClass(ColorMapper.class);
        AvroJob.setInputKeySchema(job, User.getClassSchema());
        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(IntWritable.class);

        job.setOutputFormatClass(AvroKeyValueOutputFormat.class);
        job.setReducerClass(ColorReducer.class);
        AvroJob.setOutputKeySchema(job, Schema.create(Schema.Type.STRING));
        AvroJob.setOutputValueSchema(job, Schema.create(Schema.Type.INT));

        return job.waitForCompletion(true) ? 0 : 1;
    }

    public static void main(String[] args) throws Exception {
        System.setProperty("HADOOP_USER_NAME", "root");
        Configuration conf = new Configuration();
        int res = ToolRunner.run(conf, new ColorMapReduce(), args);
        System.exit(res);
    }

}
