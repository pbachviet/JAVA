package Onlab.Lesson_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số n: ");
        int n = sc.nextInt();
        int [] array = new int[n];
        for (int i=0; i<n; i++){
            System.out.println("Mời bạn nhập số thứ "+(i+1));
            int x = sc.nextInt();
            array[i] = x;
        }
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+"\t");
        }
    }
}
