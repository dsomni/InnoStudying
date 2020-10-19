package Ex1;

public class Cat extends Animal {
    public Cat(int height, int weight, String colour){
        setColour(colour);
        setHeight(height);
        setWeight(weight);
    }

    @Override
    public void eat(){
        System.out.println("Eating mouse...");
    }

    @Override
    public void sleep(){
        System.out.println("Zzzzz...");
    }

    @Override
    public void animalSound(){
        System.out.println("meow...meow");
    }
}
