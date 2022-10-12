package Onlab.Lesson_6.EX02;

public abstract class Student {
    private String name;


    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getScore();

    public String getLearnCapacity(){
        if (getScore()<5){
            return "Học lực yếu";
        } else if (getScore()>=5 && getScore()<6.5) {
            return "Học lực khá";
        } else if (getScore()>=6.5 && getScore()<7.5) {
            return "Học lực khá";
        } else {
            return "Học lực giỏi";
        }
    }

    public abstract void show();

}
