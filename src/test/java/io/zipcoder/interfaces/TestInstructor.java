package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor("Josh", 3);
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){

        Instructor instructor = new Instructor("", 0);
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){

        Instructor instructor = new Instructor("roxy", 16);
        Student student = new Student("eddie",22);

        instructor.teach(student,40);

        Double expected = 40.0;
        Double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testLecture(){

        Instructor instructor = new Instructor("tammy", 22);
        Student greg = new Student("greg", 36);
        Student mikko = new Student("mikko", 33);

        instructor.lecture(new Student[]{greg, mikko},40);

        Double expected = 20.0;
        Double actual = greg.getTotalStudyTime();
        Assert.assertEquals(expected,actual);

        actual = mikko.getTotalStudyTime();
        Assert.assertEquals(expected,actual);


    }


    }


