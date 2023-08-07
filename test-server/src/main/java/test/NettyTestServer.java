package test;

import rpc.annotation.ServiceScan;
import rpc.serializer.CommonSerializer;
import rpc.transport.RpcServer;
import rpc.transport.netty.server.NettyServer;

/**
 * 测试用Netty服务提供者（服务端）
 *
 * @author gaoli
 */
@ServiceScan
public class NettyTestServer {

    public static void main(String[] args) {
        RpcServer server = new NettyServer("127.0.0.1", 9999, CommonSerializer.PROTOBUF_SERIALIZER);
        server.start();
    }

}
