package Onlab.Lesson_6.EX01;

public class ChuNhat {
    private double rong;
    private double dai;


    public ChuNhat(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
    }


    public double getChuVi(){
        System.out.println("Chu vi hnc: "+(dai+rong)*2);
        return (dai+rong)*2;
    }
    public double getDienTich(){
        System.out.println("Chu vi hnc: "+dai*rong);
        return dai*rong;
    }

    public void show(){
        System.out.println("Chiều dài: "+dai);
        System.out.println("Chiều rộng: "+rong);
        System.out.println("Chu vi: "+ (dai+rong)*2);
        System.out.println("Dien tich: "+ dai*rong);
    }

    public ChuNhat(){
    }

}
