package Onlab.Lesson_2;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số n: ");
        int sum = 0;
        int n = sc.nextInt();

        /*for (int i=0; i<=n; i++){
            if (i%2==0){
                sum = sum + i;
            }
        }*/

        /*while (n>=0){
            if (n%2==0){
                sum = sum + n;
            }
            n--;
        }*/

        int i=1;
        do {
            if (i%2==0){
                sum = sum + i;
            }
            i++;
        }
        while (i<=n);

        System.out.println("Tổng các số chẵn từ 1->n là: "+ sum);
    }
}
