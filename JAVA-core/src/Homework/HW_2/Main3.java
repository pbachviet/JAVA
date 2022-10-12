package Homework.HW_2;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char yesNo = 'n';
        do {
            System.out.println("Mời bạn nhập số bất kì từ 0->9: ");
            int number = sc.nextInt();
            if (number>0 && number<9){
                for (int i=1; i<10; i++){
                    System.out.println(number+ " x "+i +" = "+ (number*i));
                }
            }else {
                System.out.println("Số bạn nhập không thoả mãn ");
                continue;
            }
            do {


            } while (false);

            System.out.println("Bạn có muốn tiếp tục");
            yesNo = sc.next().charAt(0);
        }while (yesNo == 'y');
        if (yesNo == 'n'){
            System.out.println("Thoát chương trình");
        }

    }
}
