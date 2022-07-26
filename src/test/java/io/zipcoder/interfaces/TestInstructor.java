package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){

        Instructor instructor = new Instructor("", 0);
        Assert.assertTrue(instructor instanceof Teacher);

//        String expectedName = "Arnold";
//        long expectedId = 42;
//        Teacher teacher = new Teacher() {};
//        Learner learner = new Learner() {};
//
//        Instructor test = new Instructor(expectedName, expectedId);
//
//        Assert.assertEquals(expectedName, Teacher.teach(learner, 39.8));
//        Assert.assertEquals(expectedId, test.getId());
    }

    @Test
    public void testInheritance(){

        Instructor instructor = new Instructor("", 0);
        Assert.assertTrue(instructor instanceof Person);
    }


    }


