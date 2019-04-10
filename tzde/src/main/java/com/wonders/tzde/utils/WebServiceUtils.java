package com.wonders.tzde.utils;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;

/**
 * WebService工具类
 */
public class WebServiceUtils {
    /**
     * 默认的超时时间，单位毫秒
     */
    public static final long DEF_CONN_TIMEOUT = 10000;

    /**
     * 创建soap 客户端调用对象
     * @param address 地址
     * @param timeout 超时时间，毫秒
     */
    public static Client createClient4Soap(String address, long timeout) {
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient(address);
        HTTPConduit conduit = (HTTPConduit) client.getConduit();
        HTTPClientPolicy policy = new HTTPClientPolicy();
        policy.setConnectionTimeout(timeout);
        policy.setAllowChunking(false);
        policy.setReceiveTimeout(timeout * 15);
        conduit.setClient(policy);
        return client;
    }

    /**
     * 调用Soap形式的WebService
     * @param address   地址
     * @param methodName    方法名
     * @param paramXml  参数
     * @param timeout   超时时间
     */
    public static Object[] call4Soap(String address, String methodName, String paramXml, long timeout) throws Exception {
        Client client = createClient4Soap(address, timeout);
        if (client != null) {
            return client.invoke(methodName, paramXml);
        } else {
            return null;
        }
    }

    /**
     * 调用Soap形式的WebService
     * @param address   地址
     * @param methodName    方法名
     * @param paramXml  参数
     */
    public static Object[] call4Soap(String address, String methodName, String paramXml) throws Exception {
        return call4Soap(address, methodName, paramXml, DEF_CONN_TIMEOUT);
    }


}
