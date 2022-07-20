package io.zipcoder.interfaces;

public class Student extends Person implements Learner{

    double totalStudyTime;

    public Student(String name, long id){
        super(name, id);
        double totalStudyTime = 0;
    }

    public void Student(double numberOfHours){
        this.totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
