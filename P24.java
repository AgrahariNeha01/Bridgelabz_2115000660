import java.lang.reflect.Method;

class Sample {
    void fastMethod() {
        for (int i = 0; i < 1000; i++);
    }

    void slowMethod() {
        for (int i = 0; i < 1000000; i++);
    }
}

class P24 {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Sample.class;
        Object obj = cls.getDeclaredConstructor().newInstance();

        for (Method m : cls.getDeclaredMethods()) {
            long start = System.nanoTime();
            m.invoke(obj);
            long end = System.nanoTime();

            System.out.println(m.getName() + " executed in " + (end - start) + " ns");
        }
    }
}
