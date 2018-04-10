package com.zlikun.hadoop.protocol;

import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.ipc.NettyTransceiver;
import org.apache.avro.ipc.Transceiver;
import org.apache.avro.ipc.generic.GenericRequestor;
import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * 客户端测试程序
 * @author zlikun <zlikun-dev@hotmail.com>
 * @date 2018-04-10 15:04
 */
public class AvroClientTest extends ProtocolBase {

    @Test
    public void test() throws IOException {

        // 准备数据
        GenericRecord data = new GenericData.Record(schema);
        data.put("name", "香梨");
        data.put("type", 36);
        data.put("price", 5.6);
        data.put("valid", true);
        data.put("content", "价钱便宜");

        // 初始化请求
        GenericRecord request = new GenericData.Record(protocol.getMessages().get("sendMessage").getRequest());
        request.put("message", data);

        // 构造请求客户端
//        Transceiver transceiver = new HttpTransceiver(new URL("http", "localhost", port, ""));
        Transceiver transceiver = new NettyTransceiver(new InetSocketAddress(port));
        GenericRequestor requestor = new GenericRequestor(protocol, transceiver);

        // 发起请求
        Object response = requestor.request("sendMessage", request);
        // 打印响应结果
        System.out.println("响应的数据：" + response);

        // 关闭请求客户端
        if (transceiver.isConnected()) {
            transceiver.close();
        }

    }

}
