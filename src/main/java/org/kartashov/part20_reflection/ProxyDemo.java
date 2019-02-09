package org.kartashov.part20_reflection;

import java.lang.reflect.*;


/**
 * https://dzone.com/articles/java-dynamic-proxy
 * Proxy is a design pattern. We create and use proxy objects when
 * we want to add or modify some functionality of an already existing class.
 * The proxy object is used instead of the original one. Usually, the proxy objects
 * have the same methods as the original one and in Java proxy classes
 * usually extend the original class. The proxy has a handle to the original object
 * and can call the method on that.
 *
 * This way proxy classes can implement many things in a convenient way:
 *
 * * logging when a method starts and stops (AOP)
 *
 * * perform extra checks on arguments (validation)
 *
 * * mocking the behavior of the original class (Mocks)
 *
 * * implement lazy access to costly resources (Lazy)
 */
public class ProxyDemo {

    interface If {
        void originalMethod(String s);
    }

    static class Original implements If {
        public void originalMethod(String s) {
            System.out.println(s);
        }
    }

    static class Handler implements InvocationHandler {
        private final If original;
        public Handler(If original) {
            this.original = original;
        }
        public Object invoke(Object proxy, Method method, Object[] args)
                throws IllegalAccessException, IllegalArgumentException,
                InvocationTargetException {
            System.out.println("BEFORE");
            method.invoke(original, args);
            System.out.println("AFTER");
            return null;
        }
    }

    public static void main(String[] args){
        Original original = new Original();
        Handler handler = new Handler(original);
        If f = (If) Proxy.newProxyInstance(If.class.getClassLoader(),
                new Class[] { If.class },
                handler);
        f.originalMethod("Hallo");
        Array.newInstance(String[].class, 2, 3);
    }
}
