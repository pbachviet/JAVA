package Onlab.Lesson_6.EX01;

import Onlab.Lesson_6.EX01.ChuNhat;

public class Vuong extends ChuNhat {
    public Vuong(double rong, double dai) {
        super(rong, dai);
    }

    @Override
    public void show() {
        System.out.println("Chu vi h.vuong: "+super.getChuVi());
        System.out.println("Dien tich h.vuong: "+super.getDienTich());
    }
}
