package main.java.com.lucaiyu.learnjava.Extends;

class TestSuperClass {
    private int n;
    TestSuperClass(){
        System.out.println("Father main.java.com.lucaiyu.learnjava.Class");
    }
    TestSuperClass(int n){
        System.out.println(n);
        this.n = n;
    }
}
class SubClass extends TestSuperClass {
    private int n;
    SubClass(){
        System.out.println("Sub main.java.com.lucaiyu.learnjava.Class");
    }
    public SubClass(int n){
        super(300);
        System.out.println(n);
        this.n = n;
    }
}
public class SuperClass{
    public static void main(String[] args) {
        SubClass sb1 = new SubClass();
        SubClass sb2 = new SubClass(100);
    }
}
