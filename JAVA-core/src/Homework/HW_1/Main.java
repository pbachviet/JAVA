package Homework.HW_1;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String timeString = "2022/10/04";
        LocalDate timeConvert = LocalDate.parse(timeString, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println("Time: "+timeConvert);
        System.out.println("Present Time: "+LocalDateTime.now());
        System.out.println("Time at 3 days after: "+LocalDateTime.now().plusDays(3));
    }
}
