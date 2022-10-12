package Onlab.Lesson_6.EX01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập chiều rộng: ");
        double rong = sc.nextDouble();
        System.out.println("Mời bạn nhập chiều dài: ");
        double dai = sc.nextDouble();
        ChuNhat chuNhat = new ChuNhat(rong,dai);
        Vuong vuong = new Vuong(rong,rong);

        chuNhat.show();
        vuong.show();


    }
}
