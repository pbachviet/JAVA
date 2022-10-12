package Onlab.Lesson_6.EX02;

public class StudentBiz extends Student {
    private double marketingPoint;
    private double salePoint;

    public StudentBiz(String name, double marketingPoint, double salePoint) {
        super(name);
        this.marketingPoint = marketingPoint;
        this.salePoint = salePoint;
    }

    @Override
    public double getScore() {
        return ((2*marketingPoint+salePoint)/3);
    }

    @Override
    public void show() {
        System.out.println("Name: "+getName());
        System.out.println("Score: "+getScore());
        System.out.println("Learn capacity: "+getLearnCapacity());
    }
}
