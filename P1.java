import java.util.*;

class Animal {
    String n;
    int a;

    Animal(String n, int a) {
        this.n = n;
        this.a = a;
    }

    void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    Dog(String n, int a) {
        super(n, a);
    }

    void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    Cat(String n, int a) {
        super(n, a);
    }

    void makeSound() {
        System.out.println("Meow");
    }
}

class Bird extends Animal {
    Bird(String n, int a) {
        super(n, a);
    }

    void makeSound() {
        System.out.println("Chirp");
    }
}

class P1 {
    public static void main(String[] args) {
        Animal d = new Dog("Bunny", 3);
        Animal c = new Cat("Killi", 2);
        Animal b = new Bird("Twist", 1);

        d.makeSound();
        c.makeSound();
        b.makeSound();
    }
}
