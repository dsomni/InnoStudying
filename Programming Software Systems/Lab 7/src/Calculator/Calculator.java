package Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Parser parser = new Parser(input);
        parser.parse();
        double answer = parser.calculate();
        System.out.println(answer);
    }
}
