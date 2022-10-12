package Homework.HW_3;

public class Main {
    public static void main(String[] args) {
        System.out.println("hình vuông: ");
        for (int i=1; i<=4; i++){
            System.out.println("*\t*\t*\t*");
        }
        System.out.println("hình tam giác: ");
        char star = '*';
        for (int i=1; i<=4; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
