import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB05 {
    public static void main(String[] args) {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(in);
        try {
            System.out.print("Entet text: ");
            String name = input.readLine();
            System.out.println(name);
            System.out.print("Enter age: ");
            String age = input.readLine();
            System.out.println(age);
        } catch (IOException e) {
            Logger.getLogger(LAB05.class.getName()).log(Level.SEVERE,null,e);
        }
    }
}
