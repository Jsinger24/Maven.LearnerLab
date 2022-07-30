package io.zipcoder.interfaces;

public class Student extends Person implements Learner{

    double totalStudyTime;

    public Student(String name, long id){
        super(name, id);
        Students.getInstance().add(this);
        double totalStudyTime = 0;
    }

    @Override
    public void learn(double numberOfHours){
        this.totalStudyTime += numberOfHours;
    }

    @Override
    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
