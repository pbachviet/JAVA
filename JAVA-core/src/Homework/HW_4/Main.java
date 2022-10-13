package Homework.HW_4;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Khởi tạo và gán dữ liệu cho Book
        Book book1 = new Book(1, "abc", "Peter", "horror", "GDDT", 2021);
        Book book2 = new Book(2, "xyz", "James", "document", "hfjsdhg", 2022);
        Book book3 = new Book(3, "deg", "Steve", "romance", "ghdfjhg", 2012);
        Book book4 = new Book(4, "oop", "Adams", "action", "nbjehr", 2022);
        Book book5 = new Book(5, "qwe", "Justin", "drama", "ưterngm", 2023);
        Book books [] = {book1,book2,book3,book4,book5};
        // Tìm sách theo tên
        System.out.println("Mời bạn nhập tên cần tìm: ");
        String inputName = sc.nextLine();
        System.out.println("Thông tin của sách: ");
        for (int i=0; i<books.length; i++){
            if (inputName.equals(books[i].getBookName())){
                System.out.println(books[i].toString());
            }
        }

        // Tìm sách theo thể loại
        System.out.println("Mời bạn nhập thể loại cần tìm: ");
        String inputGenre = sc.nextLine();
        System.out.println("Thông tin của sách: ");
        for (int i=0; i<books.length; i++){
            if (inputGenre.equals(books[i].getGenre())){
                System.out.println(books[i].toString());
            }
        }

        // Các sách xuất bản trong năm nay
        LocalDateTime lcdt = LocalDateTime.now();
        int year = lcdt.getYear();
        System.out.println("Sách được xuất bản trong năm nay là: ");
        for (int i=0; i<books.length; i++){
            if (year == books[i].getYearPublish()){
                System.out.println(books[i].toString());
            }
        }

    }
}
