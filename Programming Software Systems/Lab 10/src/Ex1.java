import java.io.*;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            FileWriter fw = new FileWriter("output.txt");
            int c = br.read();
            while (c != -1) {
                fw.write(c);
                c = br.read();
            }
            fw.close();
        } catch (java.io.FileNotFoundException e){
            System.out.println(e.toString());
        }
    }
}
