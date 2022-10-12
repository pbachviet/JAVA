package Onlab.Lesson_2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cho a: ");
        Double a = sc.nextDouble();
        System.out.println("Nhập số cho b: ");
        Double b = sc.nextDouble();
        System.out.println("Nhập số cho c: ");
        Double c = sc.nextDouble();

        if (a==0){
            if (b==0 && c==0){
                System.out.println("PT vô số nghiệm");
            } else if (b==0 && c!=0) {
                System.out.println("PT vô nghiệm");
            } else {
                System.out.println("PT có nghiệm là: "+ -c/b);
            }
        } else {
            double delta = b*b-4*a*c;
            if (delta < 0){
                System.out.println("PT vô nghiệm");
            } else if (delta == 0) {
                System.out.println("PT có nghiệm là: "+ -b/a);
            } else {
                System.out.println("Nghiệm thứ nhất là: "+ (-b-Math.sqrt(delta))/(2*a));
                System.out.println("Nghiệm thứ hai là: "+ (-b+Math.sqrt(delta))/(2*a));
            }
        }
    }
}
