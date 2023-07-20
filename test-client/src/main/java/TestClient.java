import rpc.api.HelloObject;
import rpc.api.HelloService;
import rpc.transport.RpcClientProxy;

public class TestClient {
    public static void main(String[] args) {
        RpcClientProxy proxy = new RpcClientProxy("127.0.0.1", 9000);
        HelloService helloService = proxy.getProxy(HelloService.class);
        HelloObject object = new HelloObject(10, "This is a message");
        String res = helloService.hello(object);
        System.out.println(res);
    }
}
