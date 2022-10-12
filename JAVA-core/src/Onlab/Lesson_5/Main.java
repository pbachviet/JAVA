package Onlab.Lesson_5;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Viet");
        employee.setAddress("HN");
        employee.setAge(18);
        employee.setExperience(1.5);
        employee.setPlaceWork("Freelancer");
        System.out.println(employee.toString());

    }
}
