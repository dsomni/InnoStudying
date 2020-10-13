package exs2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Time {

    int time = 0;

    Time(int t){
        time = t;
    }

    int getTime(){
        return time;
    }

    int timeDifference(Time t){
        return time-t.getTime();
    }
}

public class AllExs2 {

    public static double FahrenheitToCelsius(double f){
        return (f-32)/1.8;
    }

    public static void main(String args[]) throws IOException {
        FileWriter fw = new FileWriter("output2.txt");
        BufferedReader br = new BufferedReader(
                new FileReader("input2.txt"));
        Scanner scanner;

        // Ex2.1
        scanner = new Scanner(br.readLine());
        fw.write(Double.toString(FahrenheitToCelsius(scanner.nextDouble())));
        fw.write('\n');

        // Ex2.2
        scanner = new Scanner(br.readLine());
        Time t1 = new Time(scanner.nextInt());
        Time t2 = new Time(scanner.nextInt());
        fw.write(Integer.toString(t1.timeDifference(t2)) +
                " " + Integer.toString(t2.timeDifference(t1)));
        fw.write('\n');

        // Ex2.3
        scanner = new Scanner(br.readLine());
        int n = scanner.nextInt();
        int base = scanner.nextInt();
        n = Integer.parseInt(Integer.toString(n),base);
        fw.write(Integer.toString(n,2) + " " +
                Integer.toString(n,10) + " " +
                Integer.toString(n,16));
        fw.write('\n');

        fw.close();

    }
}
