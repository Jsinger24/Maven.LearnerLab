package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {


    public Instructor(String name, long id) {
        super(name, id);
    }

    public void teach(Learner learner, double numberOfHours) {
        Learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours){
        int numOfLearners = learners.length;
        double hours = numberOfHours / numOfLearners;
        for(int i = 0; i < numOfLearners; i++){
            Learner.learn(hours);
        }
    }
}