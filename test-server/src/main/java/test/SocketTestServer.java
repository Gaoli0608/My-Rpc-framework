package test;

import rpc.annotation.ServiceScan;
import rpc.serializer.CommonSerializer;
import rpc.transport.RpcServer;
import rpc.transport.socket.server.SocketServer;

/**
 * 测试用服务提供方（服务端）
 *
 * @author gaoli
 */
@ServiceScan
public class SocketTestServer {

    public static void main(String[] args) {
        RpcServer server = new SocketServer("127.0.0.1", 9998, CommonSerializer.HESSIAN_SERIALIZER);
        server.start();
    }

}
