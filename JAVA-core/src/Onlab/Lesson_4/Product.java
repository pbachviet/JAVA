package Onlab.Lesson_4;

public class Product {
    private int id;
    private String name;
    private double price;

    public double caculateTax(){
        double tax = price*0.1;
        return tax;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void display(){
        System.out.println("Id: "+id+" - Name: "+name);
    }
}
