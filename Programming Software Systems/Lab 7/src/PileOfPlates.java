import java.io.*;
import java.util.Scanner;

public class PileOfPlates{

    static BufferedReader br;

    static {
        try {
            br = new BufferedReader(new FileReader("input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static FileWriter fw;

    static {
        try {
            fw = new FileWriter("output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static Scanner scanner;

    static {
        try {
            scanner = new Scanner(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public PileOfPlates() throws IOException {
    }

    public static void replace(int n, int x, int y) throws IOException {
        if(n==1){
            fw.write(String.format("Move plate %d from box %d to box %d\n",n,x,y));
        } else{
            int tmp = 6-x-y;
            replace(n-1, x, tmp);
            fw.write(String.format("Move plate %d from box %d to box %d\n",n,x,y));
            replace(n-1, tmp, y);
        }
    }

    public static void main(String args[]) throws IOException {

        int n = scanner.nextInt();
        replace(n, 1, 3);
        fw.close();
    }
}
