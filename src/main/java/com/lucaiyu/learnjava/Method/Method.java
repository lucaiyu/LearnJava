package main.java.com.lucaiyu.learnjava.Method;

public class Method {
    public static int max(int num1, int num2){
        int message = 0;
        if(num1 > num2){
            message = num1;
        }
        if (num2 > num1){
            message = num2;
        }
        if (num1 == num2) {

        }
        return message;
    }

    public static void main(String[] args) {
        System.out.println(max(1,2));
        System.out.println(max(2,2));
    }
}
