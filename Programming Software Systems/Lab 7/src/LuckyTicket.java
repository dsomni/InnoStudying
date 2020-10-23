import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LuckyTicket {
    public static void main(String args[]) throws IOException {
        Scanner scanner;
        FileWriter fw = new FileWriter("output.txt");
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        int s1 = 0;
        int s2 = 0;
        for (int i = 0; i < 3; i++) {
            s1 += br.read();
        }
        for (int i = 0; i < 3; i++) {
            s2 += br.read();
        }
        fw.write((s1==s2) ? "True" : "False");
        fw.close();
    }
}
