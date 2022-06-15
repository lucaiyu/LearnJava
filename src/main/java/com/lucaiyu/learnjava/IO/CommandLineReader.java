package main.java.com.lucaiyu.learnjava.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandLineReader {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter \"q\"");
        do {
            c = (char) br.read();
            //System.out.println(c);
        } while (c != 'q');
    }
}
