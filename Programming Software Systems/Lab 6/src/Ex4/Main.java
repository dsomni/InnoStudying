package Ex4;

public class Main {
    public static void main(String args[]){
        Calculator c = new Calculator();
        System.out.println(c.calculate(10,'+',5));
        System.out.println(c.calculate(10,'-',5));
        System.out.println(c.calculate(10,'*',5));
        System.out.println(c.calculate(10,'/',5));
        System.out.println(c.calculate(10,'/',0));

        System.out.println();

        System.out.println(c.calculate("10 + 5"));
        System.out.println(c.calculate("10 - 5"));
        System.out.println(c.calculate("10 * 5"));
        System.out.println(c.calculate("10 / 5"));
        System.out.println(c.calculate("10 / 0"));

    }
}
