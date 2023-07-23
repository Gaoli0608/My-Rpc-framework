package rpc.transport;

import lombok.extern.slf4j.Slf4j;
import rpc.entity.RpcRequest;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

@Slf4j
public class SocketClient implements  RpcClient {
    private final String host;
    private final int port;

    public SocketClient(String host, int port) {
        this.host = host;
        this.port = port;
    }
    public Object sendRequest(RpcRequest rpcRequest) {
        try(Socket socket = new Socket(host, port)) {
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            outputStream.writeObject(rpcRequest);
            outputStream.flush();
            return inputStream.readObject();
        } catch (IOException |ClassNotFoundException e) {
            log.info("调用时有错误发生",e);
            return null;
        }
    }

}
