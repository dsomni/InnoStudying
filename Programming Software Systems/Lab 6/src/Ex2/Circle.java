package Ex2;

public class Circle extends Shape {

    int Radius;

    public Circle(int Radius){
        this.Radius = Radius;
        P = calculateP();
        S = calculateS();
    }

    @Override
    public double calculateP(){ return 3.1415926*2*Radius; }

    @Override
    public double calculateS(){ return 3.1415926*Radius*Radius; }
}
