import java.lang.reflect.*;
import java.util.*;

@interface Inject {}

class DIContainer {
    private final Map<Class<?>, Object> instances = new HashMap<>();

    public <T> void register(Class<T> cls) throws Exception {
        Constructor<T> constructor = cls.getDeclaredConstructor();
        constructor.setAccessible(true);
        instances.put(cls, constructor.newInstance());
    }

    public <T> T getInstance(Class<T> cls) throws Exception {
        Object obj = instances.get(cls);
        if (obj == null) throw new IllegalStateException("No instance registered for " + cls.getName());

        for (Field f : cls.getDeclaredFields()) {
            if (f.isAnnotationPresent(Inject.class)) {
                f.setAccessible(true);
                f.set(obj, instances.get(f.getType()));
            }
        }
        return cls.cast(obj);  
    }
}


class Service {
    void serve() {
        System.out.println("Service is running!");
    }
}

class Client {
    @Inject
    Service service;

    void execute() {
        service.serve();
    }
}

class P23 {
    public static void main(String[] args) throws Exception {
        DIContainer di = new DIContainer();
        di.register(Service.class);
        di.register(Client.class);

        Client c = di.getInstance(Client.class);
        c.execute();
    }
}
