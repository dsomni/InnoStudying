package Ex1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex1a {

    public static void swap(int[] a, int pos){
        //swap a[i] with a[i+1]
        int t;
        t = a[pos];
        a[pos] = a[pos+1];
        a[pos+1] = t;
    }

    public static void main(String args[]) throws IOException {
        Scanner scanner;
        FileWriter fw = new FileWriter("output.txt");
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));

        int[] a = new int[10000];
        int size = 0;
        int o_size;
        scanner = new Scanner(br.readLine());
        while(scanner.hasNext()){
            a[size] = scanner.nextInt();
            size++;
        }
        o_size = size;

        int current = 0;
        while(current<size){
            while(a[current]==0 && current<size){
                for (int j=current;j<size-1;j++){
                    swap(a,j);
                }
                size--;
            }
            current++;
        }

        for(int i=0;i<o_size;i++){
            fw.write(Integer.toString(a[i]) + " ");
        }

        fw.close();
    }
}
