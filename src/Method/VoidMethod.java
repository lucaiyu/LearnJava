package Method;

public class VoidMethod {
    public static void printGrade(int score){
            if (score < 0 || score > 100){
            System.out.println("ERROR");}
            else if (score >= 90){
                System.out.println("A");}
            else if (score >= 80){
                System.out.println("B");}
            else if (score >= 70){
                System.out.println("C");}
            else if (score >= 60){
                System.out.println("D");}
            else {
                System.out.println("E");}
    }
    public static void main(String[] args) {
        printGrade(100);
        printGrade(200);
        printGrade(-1);
    }
}
