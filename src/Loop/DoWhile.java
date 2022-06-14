package Loop;

public class DoWhile {
    public static void main(String[] args) {
        int counter = 10;
        do {
            System.out.println("Counter is "+counter);
            counter++;
        }while (counter < 1);
        System.out.println(counter);
    }
}
