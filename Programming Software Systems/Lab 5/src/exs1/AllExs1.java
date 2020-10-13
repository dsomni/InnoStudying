package exs1;

import java.io.*;
import java.util.Scanner;

public class AllExs1 {
    public static int[] swap(int arr[]){
        return new int[]{arr[1],arr[0]};
    }

    public static int getASCII(char c){
        return (int) c;
    }

    public static char getLetter(int n){
        return (char) ('A'+n-1);
    }

    public static boolean isVowel(char c){
        char vowels[] = {'a', 'o', 'e', 'y', 'u', 'i'};
        boolean b = false;
        for(char v: vowels){
            b = c==v;
            if(b) break;
        }
        return b;
    }

    public static void main(String args[]) throws IOException {
        FileWriter fw = new FileWriter("output1.txt");
        BufferedReader br = new BufferedReader(new FileReader("input1.txt"));
        FileReader fr = new FileReader("input1.txt");

        // Ex1.a
        Scanner scanner;
        scanner= new Scanner(br.readLine());
        int a[] = {scanner.nextInt(),scanner.nextInt()};
        a = swap(a);
        fw.write(Integer.toString(a[0]) + " " + Integer.toString(a[1]));
        fw.write('\n');

        // Ex1.b
        fw.write(Integer.toString(getASCII((char)br.read())));
        fw.write('\n');
        br.read();
        br.read();

        // Ex1.c
        scanner = new Scanner(br.readLine());
        int n = scanner.nextInt();
        while(n!=-1){
            fw.write(getLetter(n)+ " ");
            n = scanner.nextInt();
        }
        fw.write('\n');


        // Ex1.d
        String s1 = br.readLine();
        String s2 = br.readLine();
        fw.write(String.valueOf(s1.equals(s2)));
        fw.write('\n');

        // Ex1.5
        int c = br.read();
        int cnt = 0;
        while(c!=-1){
            if(isVowel((Character.toLowerCase((char)c)))) cnt++;
            c = br.read();
        };
        fw.write(Integer.toString(cnt));
        fw.write('\n');

        fw.close();
    }
}
