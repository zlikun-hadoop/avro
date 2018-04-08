#### 通过`avro-tools`生成`.avro`数据文件
- 准备JSON文件
```
# users.json
{"name":"one","favorite_color":{"string":"red"}}
{"name":"two","favorite_color":{"string":"green"}}
{"name":"three","favorite_color":{"string":"purple"}}
{"name":"four","favorite_color":{"string":"green"}}
{"name":"five","favorite_color":{"string":"blue"}}
{"name":"six","favorite_color":{"string":"red"}}
{"name":"seven","favorite_color":{"string":"green"}}
{"name":"eight","favorite_color":{"string":"yellow"}}
{"name":"nine","favorite_color":{"string":"green"}}
{"name":"ten","favorite_color":{"string":"purple"}}
```
- 准备Schema文件
```
# User.schema
{
  "namespace": "com.zlikun.hadoop.avro",
  "type": "record",
  "name": "User",
  "doc": "A user info model.",
  "fields": [
    { "name": "name", "type": "string" },
    { "name": "favorite_color", "type": [ "string", "null" ] }
  ]
}
```
- 生成`.avro`文件
```
$ java -jar avro-tools-1.8.2.jar fromjson users.json --schema-file User.schema > users.avro
```

#### MR任务执行失败
```
# 查看失败的任务日志
$ yarn logs -applicationId application_1517289772935_0171
... ...
2018-04-08 19:03:47,771 INFO [main] org.apache.hadoop.service.AbstractService: Service org.apache.hadoop.mapreduce.v2.app.MRAppMaster failed in state INITED; cause: org.apache.hadoop.yarn.exceptions.YarnRuntimeException: java.lang.RuntimeException: java.lang.ClassNotFoundException: Class org.apache.avro.mapreduce.AvroKeyValueOutputFormat not found
 org.apache.hadoop.yarn.exceptions.YarnRuntimeException: java.lang.RuntimeException: java.lang.ClassNotFoundException: Class org.apache.avro.mapreduce.AvroKeyValueOutputFormat not found
 	at org.apache.hadoop.mapreduce.v2.app.MRAppMaster$2.call(MRAppMaster.java:518)
 	at org.apache.hadoop.mapreduce.v2.app.MRAppMaster$2.call(MRAppMaster.java:498)
 	at org.apache.hadoop.mapreduce.v2.app.MRAppMaster.callWithJobClassLoader(MRAppMaster.java:1593)
 	at org.apache.hadoop.mapreduce.v2.app.MRAppMaster.createOutputCommitter(MRAppMaster.java:498)
 	at org.apache.hadoop.mapreduce.v2.app.MRAppMaster.serviceInit(MRAppMaster.java:284)
 	at org.apache.hadoop.service.AbstractService.init(AbstractService.java:163)
 	at org.apache.hadoop.mapreduce.v2.app.MRAppMaster$5.run(MRAppMaster.java:1551)
 	at java.security.AccessController.doPrivileged(Native Method)
 	at javax.security.auth.Subject.doAs(Subject.java:422)
 	at org.apache.hadoop.security.UserGroupInformation.doAs(UserGroupInformation.java:1754)
 	at org.apache.hadoop.mapreduce.v2.app.MRAppMaster.initAndStartAppMaster(MRAppMaster.java:1548)
 	at org.apache.hadoop.mapreduce.v2.app.MRAppMaster.main(MRAppMaster.java:1481)
 Caused by: java.lang.RuntimeException: java.lang.ClassNotFoundException: Class org.apache.avro.mapreduce.AvroKeyValueOutputFormat not found
 	at org.apache.hadoop.conf.Configuration.getClass(Configuration.java:2267)
 	at org.apache.hadoop.mapreduce.task.JobContextImpl.getOutputFormatClass(JobContextImpl.java:223)
 	at org.apache.hadoop.mapreduce.v2.app.MRAppMaster$2.call(MRAppMaster.java:515)
 	... 11 more
 Caused by: java.lang.ClassNotFoundException: Class org.apache.avro.mapreduce.AvroKeyValueOutputFormat not found
 	at org.apache.hadoop.conf.Configuration.getClassByName(Configuration.java:2171)
 	at org.apache.hadoop.conf.Configuration.getClass(Configuration.java:2265)
 	... 13 more
 End of LogType:syslog
 
# 测试发现Hadoop-2.7.5使用Avro版本是1.7.4，所以这里使用相同版本的Avro
```