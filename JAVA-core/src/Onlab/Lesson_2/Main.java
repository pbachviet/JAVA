package Onlab.Lesson_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cho a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập số cho b: ");
        double b = sc.nextDouble();
        if (a==0 & b==0){
            System.out.println("PT vô số nghiệm");
        } else if (a==0 & b!=0) {
            System.out.println("PT vô nghiệm");
        } else {
            System.out.println("PT có nghiệm là: "+ -b/a);
        }
    }
}
