package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {


    public Instructor(String name, long id) {
        super(name, id);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours){
        int numOfLearners = learners.length;
        double hours = numberOfHours / numOfLearners;
        for(int i = 0; i < numOfLearners; i++){
            learners[i].learn(hours);
        }

    }
}