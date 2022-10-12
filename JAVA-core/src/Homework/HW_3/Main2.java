package Homework.HW_3;

import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) {
        String text = "You only live once, but if you do it right, one is enough";

        // Counting word in string
        StringTokenizer stringTokenizer = new StringTokenizer(text);
        int count = stringTokenizer.countTokens();
        System.out.println("Số từ trong chuỗi là: "+ count);

        // Counting and printing index of character 'o'
        char letter = 'o';
        System.out.print("Index của các ký tự o là: ");
        for (int i=0; i<text.length(); i++){
            if (text.charAt(i) == letter){
                System.out.print(i+",");
                count++;
            }
        }
        System.out.println("\nSố lần ký tự o xuất hiện là: "+ count);

    }
}
