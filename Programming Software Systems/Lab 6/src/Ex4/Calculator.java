package Ex4;

import java.util.Scanner;

public class Calculator {

    int answer;
    Scanner scanner;

    public int calculate(int a, char op, int b){
        return decide(a, op, b);
    }

    public int calculate(String s){
        scanner = new Scanner(s);
        int a = scanner.nextInt();
        char op = String.valueOf(scanner.next()).charAt(0);
        int b = scanner.nextInt();

        return decide(a, op, b);
    }

    private int decide(int a, char op, int b) {
        switch (op) {
            case '+' -> answer = add(a, b);
            case '-' -> answer = sub(a, b);
            case '*' -> answer = mult(a, b);
            case '/' -> answer = div(a, b);
        }

        return answer;
    }

    public int add(int a, int b){
        return a+b;
    }

    public int mult(int a, int b){
        return a*b;
    }

    public int sub(int a, int b){
        return a-b;
    }

    public int div(int a, int b){
        return (b==0)? -1: a/b;
    }

}
