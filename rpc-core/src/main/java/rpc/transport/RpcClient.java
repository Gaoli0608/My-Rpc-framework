package rpc.transport;

import rpc.entity.RpcRequest;
import rpc.serializer.CommonSerializer;

/**
 * 客户端类通用接口
 *
 * @author gaoli
 */
public interface RpcClient {

    int DEFAULT_SERIALIZER = CommonSerializer.KRYO_SERIALIZER;

    Object sendRequest(RpcRequest rpcRequest);

}
