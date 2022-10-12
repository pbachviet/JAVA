package Onlab.Lesson_2;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Car's brand: ");
        String carName = sc.nextLine();
        switch (carName){
            case "porche":
                System.out.println("This is porche cars");
                break;
            case "audi":
                System.out.println("This is audi cars");
                break;
            case "bugatti":
                System.out.println("This is bugatti car");
            default:
                System.out.println("Not Found");
        }
    }
}
