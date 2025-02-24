import java.lang.reflect.*;

interface Greeting {
    void sayHello();
}

class GreetingImpl implements Greeting {
    public void sayHello() {
        System.out.println("Hello, Neha!");
    }
}

 class LoggingProxy implements InvocationHandler {
    private final Object target;

    public LoggingProxy(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
        System.out.println("Calling method: " + m.getName());
        return m.invoke(target, args);
    }

    public static <T> T createProxy(T obj, Class<T> iface) {
        return (T) Proxy.newProxyInstance(iface.getClassLoader(), new Class<?>[]{iface}, new LoggingProxy(obj));
    }

    public static void main(String[] args) {
        Greeting g = createProxy(new GreetingImpl(), Greeting.class);
        g.sayHello();
    }
}
