package project;

public class Robot {
    int dateOfConstruction;
    int number;
    Human owner;

    public Robot(int dateOfConstruction, int number, Human owner) {
        this.dateOfConstruction = dateOfConstruction;
        this.number = number;
        this.owner = owner;
    }

    public Robot(Human owner) {
        this.dateOfConstruction = 1001;
        this.number = 123456;
        this.owner = owner;
    }

    public void shaveOwner() {
        owner.beard--;
    }
}
