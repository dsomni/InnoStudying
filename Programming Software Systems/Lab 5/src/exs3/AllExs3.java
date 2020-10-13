package exs3;

import java.io.*;
import java.util.Scanner;

public class AllExs3 {

    public static double getAverage(int[] a){
        double s = 0;
        double size = 0;
        for(int v:a){
            s+=v;
            size++;
        }
        return s/size;
    }

    public static int[] insertAt(int[] a, int el, int ins, int size){
        if(ins<size && ins>=0){
            int[] b = new int[size+1];
            int i;
            for (i=0;i<ins;i++){
                b[i] = a[i];
            }
            b[ins] = el;
            for (i=ins+1;i<size+1;i++){
                b[i] = a[i-1];
            }
            return b;
        }
        return a;
    }

    public static int[] findDuplicates(int[] a) {
        int[] b = new int[10000];
        int size = 0;
        for (int v : a) {
            b[v]++;
        }
        int j = 0;
        for (int i = 0; i < 10000; i++) {
            if(b[i]>=2){
                size++;
            }
        }
        int[] ans = new int[size];
        for (int i = 0; i < 10000; i++) {
            if(b[i]>=2){
                ans[j] = i;
                j++;
            }
        }
        return ans;
    }

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
        BufferedReader br = new BufferedReader(new FileReader("input3.txt"));
        FileWriter fw = new FileWriter("output3.txt");
        Scanner scanner;

        // Ex3.1
        scanner = new Scanner(br.readLine());
        int n = scanner.nextInt();
        int a[] = new int[n];
        scanner = new Scanner(br.readLine());
        for(int i = 0; i<n; i++){
            a[i] = scanner.nextInt();
        }
        fw.write(Double.toString(getAverage(a)));
        fw.write('\n');

        // Ex3.2
        scanner = new Scanner(br.readLine());
        int pos = scanner.nextInt();
        int el = scanner.nextInt();
        a = insertAt(a,el,pos,n);
        n++;
        for(int v:a){
            fw.write(Integer.toString(v)+" ");
        };
        fw.write('\n');

        // Ex3.3
        int[] duplicates = findDuplicates(a);
        for(int v:duplicates){
            fw.write(Integer.toString(v)+" ");
        };
        fw.write('\n');

        // Ex3.4
        int[] endZeroes = moveZeroes(a,n);
        for(int v:endZeroes){
            fw.write(Integer.toString(v)+" ");
        };
        fw.write('\n');

        fw.close();
    }
}