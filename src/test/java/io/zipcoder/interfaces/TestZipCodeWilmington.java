package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {

    @Test
    public void testHostLecture() {
        //given
        Student student = new Student("Oleg", 321);
        Student student1 = new Student("jd", 324332);
        Student student2 = new Student("freddy", 96);

        Instructor instructor = new Instructor("Chewbacca", 532);
        Instructor instructor1 = new Instructor("Clarissa", 69);

        double expected = 20;


        //when
        instructor.lecture((Learner[]) Students.getInstance().personList.toArray() ,60);

        double actual = student.getTotalStudyTime();


        //then
        Assert.assertEquals(expected, actual);

    }
}
