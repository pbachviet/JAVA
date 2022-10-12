package Homework.HW_4;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Khởi tạo Book
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = new Book();
        Book book5 = new Book();
        Book books [] = {book1,book2,book3,book4,book5};
        // Gán dữ liệu cho Book
        book1.setId(1); book1.setBookName("abc"); book1.setAuthor("Peter"); book1.setGenre("horror"); book1.setPublisher("GDDT"); book1.setYearPublish(2021);
        book2.setId(2); book2.setBookName("xyz"); book2.setAuthor("James"); book2.setGenre("document"); book2.setPublisher("fjskdjf"); book2.setYearPublish(2022);
        book3.setId(3); book3.setBookName("deg"); book3.setAuthor("Steve"); book3.setGenre("romance"); book3.setPublisher("gsgse"); book3.setYearPublish(2012);
        book4.setId(4); book4.setBookName("oop"); book4.setAuthor("Adams"); book4.setGenre("action"); book4.setPublisher("jrtjy"); book4.setYearPublish(2022);
        book5.setId(5); book5.setBookName("qwe"); book5.setAuthor("Justin"); book5.setGenre("drama"); book5.setPublisher("uytrijkety"); book5.setYearPublish(2023);

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
