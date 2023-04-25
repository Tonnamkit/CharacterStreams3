import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB01 {
    public static void main(String[] args) {
        try {
            FileWriter output = new FileWriter("data.txt");
            output.write("Hello World!");
            output.write("Welcome to Java");
            output.close();
        } catch (IOException e) {
            Logger.getLogger(LAB01.class.getName()).log(Level.SEVERE,null,e);
        }

        try {
            FileReader input = new FileReader("data.txt");
            int ch;
            while ((ch = input.read()) != -1){
                System.out.println((char) ch);
            }
        } catch (FileNotFoundException e) {
            Logger.getLogger(LAB01.class.getName()).log(Level.SEVERE,null,e);
        } catch (IOException e) {
            Logger.getLogger(LAB01.class.getName()).log(Level.SEVERE,null,e);
        }
    }
}
