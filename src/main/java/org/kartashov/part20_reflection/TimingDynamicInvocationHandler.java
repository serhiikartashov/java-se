package org.kartashov.part20_reflection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class TimingDynamicInvocationHandler implements InvocationHandler {

    private static Logger logger = LoggerFactory.getLogger(
            TimingDynamicInvocationHandler.class);

    private final Map<String, Method> methods = new HashMap<>();

    private Object target;

    public TimingDynamicInvocationHandler(Object target) {
        this.target = target;

        for(Method method: target.getClass().getDeclaredMethods()) {
            this.methods.put(method.getName(), method);
        }
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        long start = System.nanoTime();
        Object result = methods.get(method.getName()).invoke(target, args);
        long elapsed = System.nanoTime() - start;

        logger.info("Executing {} finished in {} ns", method.getName(),
                elapsed);

        return result;
    }

    public static void main(String[] args) {
        Map mapProxyInstance = (Map) Proxy.newProxyInstance(
                TimingDynamicInvocationHandler.class.getClassLoader(), new Class[] { Map.class },
                new TimingDynamicInvocationHandler(new HashMap<>()));

        mapProxyInstance.put("hello", "world");

        CharSequence csProxyInstance = (CharSequence) Proxy.newProxyInstance(
                TimingDynamicInvocationHandler.class.getClassLoader(),
                new Class[] { CharSequence.class },
                new TimingDynamicInvocationHandler("Hello World"));

        logger.info(Integer.valueOf(csProxyInstance.length()).toString());
    }
}
