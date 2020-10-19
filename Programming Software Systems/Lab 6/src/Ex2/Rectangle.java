package Ex2;

public class Rectangle extends Shape {
    int Length;
    int Width;

    public Rectangle(int Length, int Width){
        this.Length = Length;
        this.Width = Width;
        P = calculateP();
        S = calculateS();
    }

    @Override
    public double calculateP(){ return 2*(Length+Width); }

    @Override
    public double calculateS(){ return Length*Width; }
}
