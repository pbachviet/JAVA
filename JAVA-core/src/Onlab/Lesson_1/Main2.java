package Onlab.Lesson_1;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên hàng nhập kho: ");
        String productName = sc.nextLine();
        System.out.println("Mời bạn nhập ngày tháng năm sinh: ");
        String birthDay = sc.nextLine();
        LocalDate birthDayyy = LocalDate.parse(birthDay, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println("Mời bạn thời gian nhập kho: ");
        String importTime = sc.nextLine();
        LocalDateTime importTimeee = LocalDateTime.parse(importTime, DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
        System.out.println("Ngày tháng năm sinh của bạn là: "+birthDayyy);
        System.out.println("Thời gian nhập kho là: "+importTimeee);
    }
}
