package Homework.HW_5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Khởi tạo employee
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();
        Employee employees[] = {employee1, employee2, employee3, employee4, employee5};
        // Gán dữ liệu cho employee
        employee1.setId(1); employee1.setName("Luka"); employee1.setBirthDay("1990/10/04"); employee1.setGender("Male"); employee1.setSalary(1000);
        employee2.setId(2); employee2.setName("Steph"); employee2.setBirthDay("1997/05/16"); employee2.setGender("Female"); employee2.setSalary(1200);
        employee3.setId(3); employee3.setName("Rachel"); employee3.setBirthDay("1999/12/24"); employee3.setGender("Male"); employee3.setSalary(1050);
        employee4.setId(4); employee4.setName("Joe"); employee4.setBirthDay("1988/02/09"); employee4.setGender("Male"); employee4.setSalary(3000);
        employee5.setId(5); employee5.setName("Jimmy"); employee5.setBirthDay("2000/10/07"); employee5.setGender("Female"); employee5.setSalary(3300);

        // Tìm nhân viên theo số ID
        System.out.println("Mời bạn nhập ID cần tìm: ");
        String inputIdStr = sc.nextLine();
        int inputId = Integer.parseInt(inputIdStr);
        System.out.println("Thông tin của nhân viên: ");
        for (int i=0; i<employees.length; i++){
            if (inputId == employees[i].getId()){
                System.out.println(employees[i].toString());
            }
        }

        // Tìm nhân viên theo tên
        System.out.println("Mời bạn nhập tên cần tìm: ");
        String inputName = sc.nextLine();
        System.out.println("Thông tin của nhân viên: ");
        for (int i=0; i<employees.length; i++){
            if (inputName.equals(employees[i].getName())){
                System.out.println(employees[i].toString());
            }
        }

        // Đếm số nhân viên nam vs nữ
        int countMale = 0;
        int countFemale = 0;
        for (int i=0; i<employees.length; i++){
            if (employees[i].getGender()=="Male"){
                countMale++;
            } else if (employees[i].getGender()=="Female") {
                countFemale++;
            }
        }
        System.out.println("Số nhân viên nam là: "+ countMale);
        System.out.println("Số nhân viên nữ là: "+ countFemale);



    }
}
