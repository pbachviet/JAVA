package Onlab.Lesson_3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số dòng: ");
        int row = sc.nextInt();
        System.out.println("Mời bạn nhập số cột: ");
        int column = sc.nextInt();
        int [][] array = new int[row][column];
        int sum = 0;
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                System.out.println("Mời bạn nhập giá trị array["+i+"]["+j+"]: ");
                array[i][j] = sc.nextInt();
            }
        }
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                if (array[i][j]%3==0){
                    sum = sum + array[i][j];
                }

            }
        }
        System.out.println("Tổng của các giá trị vừa nhập là: "+sum);

    }
}
