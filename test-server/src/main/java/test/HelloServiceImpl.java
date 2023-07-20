package test;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

import lombok.extern.slf4j.Slf4j;
import rpc.api.HelloObject;
import rpc.api.HelloService;

@Slf4j
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(HelloObject object) {
//        log.info("接收到：{}",object.getMessage());
        log.info("接收到：{}",object.getId()+object.getMessage());
        return "这是调用的返回值，id={"+object.getId()+"}";
    }
}
