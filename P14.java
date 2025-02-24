import java.lang.reflect.*;

class Person {
    private int age;

    Person(int age) {
        this.age = age;
    }
}

class P14 {
    public static void main(String[] args) throws Exception {
        Person p = new Person(25);
        Field f = Person.class.getDeclaredField("age");
        f.setAccessible(true);

        System.out.println("Original Age: " + f.get(p));
        f.set(p, 30);
        System.out.println("Modified Age: " + f.get(p));
    }
}
