package bai4_6;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal");
        System.out.println(animal);

        Mammal mammal = new Mammal("Generic Mammal");
        System.out.println(mammal);

        Cat cat = new Cat("Kitty");
        System.out.println(cat);
        cat.greets();

        Dog dog1 = new Dog("BigDaddy");
        System.out.println(dog1);
        dog1.greets();

        Dog dog2 = new Dog("Jack97");
        dog1.greets(dog2);
    }
}