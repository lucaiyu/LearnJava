package Class;

public class Puppy {
    int Age;
    public Puppy(String name){
        System.out.println("It names" + name);
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getAge() {
        System.out.println("This dog's age is " + Age);
        return Age;
    }
    public static void main(String[] args) {
        Puppy newPuppy = new Puppy("Tom");
        newPuppy.setAge(2);
        newPuppy.getAge();
        System.out.println("This dog's age is " + newPuppy.Age);
    }
}
