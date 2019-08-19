package org.kartashov.part19_reflection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

public class DynamicInvocationHandler implements InvocationHandler {

    private static Logger LOGGER = LoggerFactory.getLogger(
            DynamicInvocationHandler.class);

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        LOGGER.info("Invoked method: {}", method.getName());

        return 42;
    }

    public static void main(String[] args) {
        Map proxyInstance1 = (Map) Proxy.newProxyInstance(
                DynamicInvocationHandler.class.getClassLoader(),
                new Class[]{Map.class},
                new DynamicInvocationHandler());

        proxyInstance1.put("hello", "world");

        Map proxyInstance2 = (Map) Proxy.newProxyInstance(DynamicInvocationHandler.class.getClassLoader(),
                new Class[]{Map.class},
                (proxy, method, methodArgs) -> {
            if (method.getName().equals("get")) {
                return 42;
            } else {
                throw new UnsupportedOperationException(
                        "Unsupported method: " + method.getName());
            }
        });

        System.out.println(proxyInstance2.get("hello")); // 42
        proxyInstance2.put("hello", "world"); // exception
    }
}
