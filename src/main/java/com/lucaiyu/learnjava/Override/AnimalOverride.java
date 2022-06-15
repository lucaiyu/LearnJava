package main.java.com.lucaiyu.learnjava.Override;

class Animal{
    public void say(){
        System.out.println("Animal is saying");
    }
}
class Dog extends Animal{
    public void say() {
        System.out.println("Dog is barking");
    }
    public void move(){
        System.out.println("Dog is moving");
    }
}
public class AnimalOverride {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog b = new Dog();
        a.say();
        b.say();
        b.move();
    }
}
