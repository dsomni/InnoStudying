package project;

import java.util.Scanner;

public class Project {
    public static void main(String args[]){
        System.out.println("\nWrite your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("\nWrite your surname: ");
        String surname = scanner.next();

        System.out.println("\nWrite your age: ");
        int age = scanner.nextInt();

        System.out.println("\nWrite your sex: ");
        String sex = scanner.next();

        System.out.println("\nWrite length of your beard: ");
        int beard = scanner.nextInt();

        Human human = new Human(age, name,surname,sex,beard);

        System.out.println("\nWrite your robot's dateOfConstruction: ");
        int dateOfConstruction = scanner.nextInt();

        System.out.println("\nWrite your robot's number: ");
        int number = scanner.nextInt();

        Robot robot = human.createRobot(dateOfConstruction, number);

        robot.shaveOwner();

    }
}
