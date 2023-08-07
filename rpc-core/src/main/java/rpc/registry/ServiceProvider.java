package rpc.registry;


/**
 * 保存和提供服务实例对象
 * @author gaoli
 */
public interface ServiceProvider {


    <T> void addServiceProvider(T service);

    Object getServiceProvider(String serviceName);

}
