package com.zlikun.hadoop.protocol;

import org.apache.avro.Protocol;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.ipc.NettyServer;
import org.apache.avro.ipc.generic.GenericResponder;

import java.net.InetSocketAddress;

/**
 * @author zlikun <zlikun-dev@hotmail.com>
 * @date 2018-04-10 14:56
 */
public class AvroServer extends GenericResponder {

    private Protocol protocol;
    private Schema schema;

    public AvroServer(Protocol protocol) {
        super(protocol);
        this.protocol = protocol;
        schema = protocol.getType("Message");
    }

    @Override
    public Object respond(Protocol.Message message, Object request) throws Exception {
        GenericRecord req = (GenericRecord) request;
        GenericRecord resp = null;
        if (message.getName().equals("sendMessage")) {
            // 请求输入数据
            System.out.println("接收到数据：" + req.get("message"));

            // 响应返回数据
            resp = new GenericData.Record(schema);
            resp.put("name", "苹果");
            resp.put("type", 100);
            resp.put("price", 4.6);
            resp.put("valid", true);
            resp.put("content", "最新上架货物");
        }
        return resp;
    }

    public void run(int port) {

        try {
            // Avro提供了多种服务端和客户端实现
            // 1、基于Jetty的HttpServer和HttpTransceiver
            // 2、基于Netty的NettyServer和NettyTransceiver
            // 3、基于TCP的SocketServer和SocketTransceiver
            // 4、基于UDP的DatagramServer和DatagramTransceiver
            // 5、基于加密TCP的SaslSocketServer和SaslSocketTransceiver

//            // 基于Jetty的HttpServer，客户端也应使用对应的客户端类
//            HttpServer server = new HttpServer(this, port);
//            server.start();
//            server.join();

            // 基于Netty的NettyServer
            NettyServer server = new NettyServer(this, new InetSocketAddress(port));
            // 进程结束时，关闭服务器
            Runtime.getRuntime().addShutdownHook(new Thread(() -> server.close()));
            // 启动服务
            server.start();
            // 线程阻塞
            server.join();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
