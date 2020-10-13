package project;

public class Human {
    int age;
    String name;
    String surname;
    String sex;
    public int beard;

    public Human(int age, String name, String surname, String sex, int beard) {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.beard = beard;
    }

    public Human() {
        this.age = 30;
        this.name = "Vasya";
        this.surname = "Pupkin";
        this.sex = "male";
        this.beard = 0;
    }

    public void changeNameAndSurname(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public void haveBirthday(){
        age++;
    }

    public void growBeard(){
        beard++;
    }

    public void changeSex(String sex){
        this.sex = sex;
    }

    public  Robot  createRobot(){
        return new Robot(this);
    }

    public  Robot  createRobot(int dateOfConstruction, int number){
        return new Robot(dateOfConstruction,number, this);
    }

}
