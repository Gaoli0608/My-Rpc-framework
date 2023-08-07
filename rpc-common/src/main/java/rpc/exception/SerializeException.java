package rpc.exception;

/**
 * 序列化异常
 *
 * @author gaoli
 */
public class SerializeException extends RuntimeException {
    public SerializeException(String msg) {
        super(msg);
    }
}
