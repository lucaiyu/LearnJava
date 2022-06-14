package Method;

public class BuildMethod {
    public static void main(String[] args) {
        Class class1 = new Class();
        Class class2 = new Class();
        System.out.println(class1.a + "," + class2.a );
    }
}

class Class{
    int a;
    Class(){
        a = 10;
    }
}
