package io.zipcoder.interfaces;

import java.util.Arrays;
import java.util.HashMap;

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

    public HashMap<Student, Double> getStudyMap(){
        HashMap<Student, Double> studyMap = new HashMap();
        for (Student student : (Student[]) students.personList.toArray()){
            studyMap.put(student,student.getTotalStudyTime());
        }
        return studyMap;
    }


}
