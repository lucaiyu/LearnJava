package main.java.com.lucaiyu.learnjava.IO;

import java.io.*;

public class FileIO {
    public static void main(String[] args) {
        try {
            byte bWrite[] = {11, 21, 3, 40, 5};
            OutputStream out = new FileOutputStream("./TestFile.txt");
            for (int i = 0; i <bWrite.length; i++){
                out.write(bWrite[i]);
            }
            out.close();


            InputStream file = new FileInputStream("./TestFile.txt");
            int size = file.available();

            for (int i = 0; i < size; i++) {
                System.out.println((char) file.read() + "   ");
            }
            file.close();
        }
        catch (
                IOException e){
            System.out.println("ERROR");
        }
    }

}
