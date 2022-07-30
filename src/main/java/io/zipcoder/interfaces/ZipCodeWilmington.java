package io.zipcoder.interfaces;

import java.util.Arrays;

public class ZipCodeWilmington {

    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture((Learner[]) students.personList.toArray(), numberOfHours);
    }


    public void hostLecture(long id, double numberOfHours){
        Instructor instructor = (Instructor) instructors.findById(id);
        instructor.lecture((Learner[]) students.personList.toArray(), numberOfHours);
    }


}
