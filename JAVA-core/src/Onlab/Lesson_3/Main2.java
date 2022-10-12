package Onlab.Lesson_3;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số n: ");
        int n = sc.nextInt();
        int [] array = new int[n];
        for (int i=0; i<n; i++){
            System.out.println("Mời bạn nhập phần tử thứ "+(i+1));
            array[i] = sc.nextInt();
        }
        for (int i=0; i< array.length; i++){
            System.out.print(array[i]+"\t");
            if (array[i]%2==0){
                array[i]++;
            }
            System.out.println(array[i]+"\t");
        }
    }
}
