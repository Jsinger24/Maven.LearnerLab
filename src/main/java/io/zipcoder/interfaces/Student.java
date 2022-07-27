package io.zipcoder.interfaces;

public class Student extends Person implements Learner{

    double totalStudyTime;

    public Student(String name, long id){
        super(name, id);
        Students.getInstance().add(this);
        double totalStudyTime = 0;
    }

    public void learn(double numberOfHours){
        this.totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
