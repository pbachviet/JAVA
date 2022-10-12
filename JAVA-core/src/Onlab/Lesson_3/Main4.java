package Onlab.Lesson_3;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số dòng cho ma trận 1: ");
        int row1 = sc.nextInt();
        System.out.println("Nhập số cột cho ma trận 1: ");
        int column1 = sc.nextInt();
        System.out.println("Nhập số dòng cho ma trận 2: ");
        int row2 = sc.nextInt();
        System.out.println("Nhập số cột cho ma trận 2: ");
        int column2 = sc.nextInt();
        int [][] array1 = new int[row1][column1];
        int [][] array2 = new int[row2][column2];
        int sum = 0;

        if (row1!=row2 || column1!=column2){
            System.out.println("Không thể thực hiện");
        }else {
            for (int i=0; i<row1; i++){
                for (int j=0; j<column1; j++){
                    System.out.println("Mời bạn nhập giá trị ma trận 1["+i+"]["+j+"]: ");
                    array1[i][j] = sc.nextInt();
                }
            }
            for (int i=0; i<row2; i++){
                for (int j=0; j<column2; j++){
                    System.out.println("Mời bạn nhập giá trị ma trận 2["+i+"]["+j+"]: ");
                    array2[i][j] = sc.nextInt();
                }
            }
            for (int i=0; i<row1; i++){
                for (int j=0; j<column1; j++){
                    System.out.print(array1[i][j]+"\t");
                    System.out.print(array2[i][j]+"\t");
                    sum = array1[i][j] + array2[i][j];
                    System.out.println(sum+"\t");
                }
            }

        }
    }
}
