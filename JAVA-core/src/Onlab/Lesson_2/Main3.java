package Onlab.Lesson_2;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số điện đã sử dụng: ");
        int electric = sc.nextInt();
        if (0<=electric && electric<=50){
            System.out.println("Tổng tiền điện là: "+ electric*1000);
        } else if (electric>50) {
            System.out.println("Tổng tiền điện là: "+ (50*1000+(electric-50)*1200));
        }
    }
}
