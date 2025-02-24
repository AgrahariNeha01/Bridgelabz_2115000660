import java.util.*;

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof Woof");
    }
}

class P1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
    }
}
