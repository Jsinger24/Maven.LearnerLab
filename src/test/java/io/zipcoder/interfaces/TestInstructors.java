package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void testInstructorsSingleton(){

        Instructor instructor = new Instructor("Liz",12345);
        Instructor instructor1 = new Instructor("Banjo",34556);
        Instructor instructor2 = new Instructor("KrisKringle",343434);

        Boolean actual = Instructors.getInstance().contains(instructor);

        Assert.assertTrue(actual);

    }
}
