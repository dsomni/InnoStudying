package Ex1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex1 {

    public static int[] moveZeroes(int[] a, int size){
        int[] b = new int[size];
        int j = 0;
        for(int i = 0; i< size; i++){
            if(a[i]!=0){
                b[j] = a[i];
                j++;
            }
        }
        return b;
    }

    public static void main(String args[]) throws IOException {
        Scanner scanner;
        FileWriter fw = new FileWriter("output.txt");
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));

        int[] a = new int[10000];
        int size = 0;
        scanner = new Scanner(br.readLine());
        while(scanner.hasNext()){
            a[size] = scanner.nextInt();
            size++;
        }
        a = moveZeroes(a, size);

        for(int el: a){
            fw.write(Integer.toString(el) + " ");
        }

        fw.close();
    }
}
