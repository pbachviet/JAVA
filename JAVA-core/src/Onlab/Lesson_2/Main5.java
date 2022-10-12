package Onlab.Lesson_2;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập a: ");
        double a = sc.nextDouble();
        System.out.println("Mời bạn nhập b: ");
        double b = sc.nextDouble();
        System.out.println("Các phép toán: 1.Cộng 2.Trừ 3.Nhân 4.Chia 5.Chia dư");
        System.out.println("Mời bạn chọn phép toán");
        int number = sc.nextInt();
        switch (number){
            case 1 :
                System.out.println("Kết quả là: "+ (a+b));
                break;
            case 2 :
                System.out.println("Kết quả là: "+ (a-b));
                break;
            case 3 :
                System.out.println("Kết quả là: "+ (a*b));
                break;
            case 4 :
                System.out.println("Kết quả là: "+ (a/b));
                break;
            case 5 :
                System.out.println("Kết quả là: "+ (a%b));
        }
    }
}
