package Ex2;

abstract public class Shape {

    abstract double calculateP();
    abstract double calculateS();

    double S;
    double P;

    void setP(double P){ this.P = P;}
    void setS(double S){ this.S = S;}

    double getP(){ return P; }
    double getS(){ return S; }
}
