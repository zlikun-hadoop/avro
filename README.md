# Avro

- <http://avro.apache.org/>
- <http://avro.apache.org/docs/current/>
- <http://avro.apache.org/docs/current/gettingstartedjava.html>
- <http://avro.apache.org/docs/current/spec.html>
- <http://avro.apache.org/docs/current/mr.html>

#### Compiling the schema
```
# http://mvnrepository.com/artifact/org.apache.avro/avro-tools/1.8.2
$ java -jar avro-tools-1.8.2.jar compile schema <schema file> <destination>
$ java -jar avro-tools-1.8.2.jar compile schema user.avsc .
```