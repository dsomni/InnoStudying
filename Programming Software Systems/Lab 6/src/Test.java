
class Shape{
    int square;
    int vertex;
    public Shape(int sq, int ve){
        square = sq;
        vertex = ve;
    }
}

class Rectangular extends Shape{

    int perimeter;

    public Rectangular(int sq, int ve, int p) {
        super(sq, ve);
        perimeter = p;
    }
}

class Circle extends Shape{

    int radius;

    public Circle(int sq, int ve, int r) {
        super(sq, ve);
        radius = r;
    }
}

public class Test {
    public static void main(String args[]){
        Rectangular rect = new Rectangular(9,4,12);

        Shape shape = rect;

        Circle circle = (Circle) shape;
        System.out.println(circle.radius);
    }
}
