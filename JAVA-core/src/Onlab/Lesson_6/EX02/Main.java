package Onlab.Lesson_6.EX02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sinh viên IT: ");
        Student studentIT = new StudentIT("Viet", 5, 4, 8);
        studentIT.show();
        System.out.println();
        System.out.println("Sinh viên Business: ");
        Student studentBiz = new StudentBiz("Curry", 9, 8);
        studentBiz.show();
    }
}
