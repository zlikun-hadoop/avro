package com.zlikun.hadoop.protocol;

import org.junit.Test;

/**
 * 服务端测试程序
 * @author zlikun <zlikun-dev@hotmail.com>
 * @date 2018-04-10 14:51
 */
public class AvroServerTest extends ProtocolBase {

    private int port = 7777;

    @Test
    public void test() {

        new AvroServer(this.protocol).run(this.port);

    }

}
