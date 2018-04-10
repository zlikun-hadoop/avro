package com.zlikun.hadoop.protocol;

import org.apache.avro.Protocol;
import org.apache.avro.Schema;
import org.junit.Before;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @author zlikun <zlikun-dev@hotmail.com>
 * @date 2018-04-10 15:05
 */
public abstract class ProtocolBase {

    protected Protocol protocol;
    protected Schema schema;
    protected int port = 7777;

    @Before
    public void init() {
        try {
            URL url = AvroServerTest.class.getClassLoader().getResource("message.avpr");
            protocol = Protocol.parse(new File(url.getPath()));
            schema = protocol.getType("Message");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
