package Homework.HW_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Giải phương trình bậc nhất\n2.Giải phương trình bậc 2\n3.Tính tiền điện\n4.Kết thúc");
        System.out.println("Mời bạn chọn chức năng: ");
        int selection = sc.nextInt();
        switch (selection){
            case 1 :
                System.out.println("Nhập số cho x: ");
                double x = sc.nextDouble();
                System.out.println("Nhập số cho y: ");
                double y = sc.nextDouble();
                if (x==0 & y==0){
                    System.out.println("PT vô số nghiệm");
                } else if (x==0 & y!=0) {
                    System.out.println("PT vô nghiệm");
                } else {
                    System.out.println("PT có nghiệm là: "+ -y/x);
                }
                break;
            case 2 :
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
                break;
            case 3 :
                System.out.println("Nhập số điện đã sử dụng: ");
                int electric = sc.nextInt();
                if (0<=electric && electric<=50){
                    System.out.println("Tổng tiền điện là: "+ electric*1000);
                } else if (electric>50) {
                    System.out.println("Tổng tiền điện là: "+ (50*1000+(electric-50)*1200));
                }
                break;
            case 4 :
                System.out.println("Đã đóng");
                break;
        }
    }
}
