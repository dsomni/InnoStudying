import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IncorrectEquation {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input"));
        FileWriter fw = new FileWriter("output");
        Scanner scanner = new Scanner(br.readLine());
        int a = scanner.nextInt();
        if (a==0){
            fw.write(Integer.toString(-1));
        }else{
            int ans = 0;
            for(int c = -10000000; c <=1000000;c++ ){
                if (c!=a && a*(c-1)%(c-a)==0){
                    ans++;
                }
            }
            fw.write(Integer.toString(ans));
        }
        fw.close();
    }
}
