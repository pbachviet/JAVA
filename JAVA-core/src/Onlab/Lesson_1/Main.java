package Onlab.Lesson_1;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Mời bạn nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Mời bạn nhập địa chỉ: ");
        String address = sc.nextLine();
        System.out.println("Tên của bạn là: "+name);
        System.out.println("Tuổi của bạn là: "+age);
        System.out.println("Địa chỉ của bạn là: "+address);
    }
}
