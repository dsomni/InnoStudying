package Ex2;

public class Triangle extends Shape {
    int Side1;
    int Side2;
    int Side3;
    double p;

    public Triangle(int Side1, int Side2, int Side3){
        this.Side1 = Side1;
        this.Side2 = Side2;
        this.Side3 = Side3;
        P = calculateP();
        S = calculateS();
        p = P/2;
    }

    @Override
    public double calculateP(){ return Side1+Side2+Side3; }

    @Override
    public double calculateS(){ return Math.sqrt((p-Side1)*(p-Side2)*(p-Side3)); }
}
