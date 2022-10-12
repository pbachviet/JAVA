package Homework.HW_2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        String text = "Hello everyone";
        char letter = 'e';
        int count = 0;
        int index = 0;
        System.out.println("Ký tự e có index lần lượt là: ");
        for (int i=1; i<text.length(); i++){
            if (text.charAt(i) == letter){
                count++;
                System.out.println( i );
            }
        }
        System.out.println("Số lần e xuất hiện là: "+ count);
    }
}
