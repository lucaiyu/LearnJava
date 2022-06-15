package main.java.com.lucaiyu.learnjava.Array;

public class Array {
    public static void main(String[] args) {
        //init array
        double[] list = new double[5];
        list[0] = 1.1;
        list[1] = -2.2;
        list[2] = 3.3;
        list[3] = 4.4;
        list[4] = 100092897.908299088802;

        //calc sum
        double total  = 0;
        for (int i = 0; i<5; i++){
            total += list[i];
        }
        System.out.println(total);

        //print all
        for (int i = 0; i < 5; i++) {
            System.out.println(list[i]);
        }

        //search max
        double max = list[0];
        for (int i = 1; i < 5; i++) {
            if(list[i] > max){
                max = list[i];
            }
        }
        System.out.println(max);
    }
}
