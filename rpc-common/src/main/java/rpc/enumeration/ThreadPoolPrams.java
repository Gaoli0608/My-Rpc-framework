package rpc.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ThreadPoolPrams {
    CORE_POOL_SIZE(5),
    MAXIMUM_POOL_SIZE(50),
    KEEP_ALIVE_TIME(60),
    BLOCKING_QUEUE_CAPACITY(100);
    private final int param;

}
