package rpc.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 字节流中标识序列化和反序列化器
 * @author ziyang
 */
@AllArgsConstructor
@Getter
public enum SerializerCode {

    JSON(1),
    KRYO(0);

    private final int code;

}