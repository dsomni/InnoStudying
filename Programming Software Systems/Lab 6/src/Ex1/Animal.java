package Ex1;

public abstract class Animal {

    abstract void eat();
    abstract void sleep();
    abstract void animalSound();

    int height;
    int weight;
    String colour;

    int getHeight(){ return height; }
    int getWeight(){ return weight; }
    String getColour(){ return colour; }

    void setHeight(int h){ height = h; }
    void setWeight(int w){ weight = w; }
    void setColour(String c){ colour = c; }

}
