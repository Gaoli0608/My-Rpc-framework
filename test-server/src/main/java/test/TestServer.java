package test;


import rpc.api.HelloObject;
import rpc.api.HelloService;
import rpc.transport.server.RpcServer;

public class TestServer {
    public static void main(String[] args) {
        HelloService helloService =new HelloServiceImpl();
        RpcServer rpcServer = new RpcServer();
        rpcServer.register(helloService,9000);
    }

}
