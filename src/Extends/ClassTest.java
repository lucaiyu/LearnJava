package Extends;

class Animal {
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal {
    void eat() {
        System.out.println("Dog is eating");
    }
    void eatTest(){
        this.eat();
        super.eat();
    }
}
public class ClassTest{
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        Dog b = new Dog();
        b.eatTest();
    }
}
