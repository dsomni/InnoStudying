import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

abstract class Shape{
    String P;
    String S;
    static DecimalFormat dF = new DecimalFormat("#.#");

    String getP(){
        return P;
    }

    String getS(){
        return S;
    }

    String frmt(double d){
        return dF.format((double) ((int)(d*10))/10);
    }

    abstract void Calculate();
}

class Circle extends Shape{
    int R;
    public Circle(int r){
        this.R = r;
        Calculate();
    }

    void Calculate(){
        this.P = frmt(2*3.1415*R);
        this.S = frmt(3.1415*R*R);
    }
}

class Rectangular extends Shape{
    int A, B;
    public Rectangular(int a, int b){
        this.A = a;
        this.B = b;
        Calculate();
    }

    void Calculate(){
        this.P = frmt(2*(A+B));
        this.S = frmt(A*B);
    }
}

class Triangle extends Shape{
    int A, B, C;
    double p;
    public boolean exists = false;
    public Triangle(int a, int b, int c){
        this.A = a;
        this.B = b;
        this.C = c;
        if((A+B>C) && (A+C>B) && (B+C>A)){
            exists = true;
            Calculate();
        }
    }


    void Calculate(){
        this.P = frmt(A+B+C);
        p = (double)(A+B+C)/2;
        this.S = frmt(Math.sqrt(p*(p-A)*(p-B)*(p-C)));
    }
}

class Ellipse extends Shape{
    int A, B;
    public Ellipse(int a, int b){
        this.A = a;
        this.B = b;
        Calculate();
    }

    void Calculate(){
        this.P = frmt(2*3.1415*Math.sqrt((double)(A*A+B*B)/2));
        this.S = frmt(3.1415*A*B);
    }
}

public class Ex1 {
    public static void main(String args[]) throws IOException {
        Scanner scanner;
        FileWriter fw = new FileWriter("output.txt");
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));

        Shape shape;
        int c = br.read();
        int a,b;
        double s,p;
        if(c==101){
            scanner = new Scanner(br.readLine());
            a = scanner.nextInt();
            b = scanner.nextInt();
            shape = new Ellipse(a,b);
            fw.write(String.format("P=%s\nA=%s", shape.getP(), shape.getS()));
        }else{
            br = new BufferedReader(new FileReader("input.txt"));
            scanner = new Scanner(br.readLine());
            a = scanner.nextInt();
            if (scanner.hasNextInt()) {
                b = scanner.nextInt();
                if(scanner.hasNextInt()){
                    c = scanner.nextInt();
                    shape = new Triangle(a,b,c);
                    if(((Triangle) shape).exists){
                        fw.write(String.format("P=%s\nA=%s", shape.getP(), shape.getS()));
                    }else{
                        fw.write("-1");
                    }
                }else{
                    shape = new Rectangular(a,b);
                    fw.write(String.format("P=%s\nA=%s", shape.getP(), shape.getS()));
                }
            }else{
                shape = new Circle(a);
                fw.write(String.format("P=%s\nA=%s", shape.getP(), shape.getS()));
            }

        }

        fw.close();
    }
}
