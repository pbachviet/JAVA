package Onlab.Lesson_5;

public class Employee extends Person {
    private double experience;
    private String placeWork;

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public String getPlaceWork() {
        return placeWork;
    }

    public void setPlaceWork(String placeWork) {
        this.placeWork = placeWork;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID = " + super.getId() +
                "Name = " + super.getName() +
                "Address = " + super.getAddress() +
                "Age = " + super.getAge() +
                "experience=" + experience +
                ", placeWork='" + placeWork + '\'' +
                '}';
    }
    public String display(){
        return toString();
    }
}
