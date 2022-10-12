package Onlab.Lesson_6.EX02;

public class StudentIT extends Student {
    private double javaPoint;
    private double htmlPoint;
    private double cssPoint;

    public StudentIT(String name, double javaPoint, double htmlPoint, double cssPoint) {
        super(name);
        this.javaPoint = javaPoint;
        this.htmlPoint = htmlPoint;
        this.cssPoint = cssPoint;
    }

    @Override
    public double getScore() {
        return ((javaPoint*2+htmlPoint+cssPoint)/4);
    }

    @Override
    public void show() {
        System.out.println("Name: "+getName());
        System.out.println("Score: "+getScore());
        System.out.println("Learn capacity: "+getLearnCapacity());
    }
}
