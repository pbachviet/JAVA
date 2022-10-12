package Onlab.Lesson_4;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Iphone");
        product.setId(1);
        product.setPrice(20);
        System.out.println("Tax: "+product.caculateTax());
        product.display();
    }
}
