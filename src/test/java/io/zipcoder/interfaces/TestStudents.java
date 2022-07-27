package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {
    @Test

    public void testSingletonContains(){
        Student student = new Student("ryan", 1234);
        Student student1 = new Student("eric", 4321);
        Student student2 = new Student("todd", 4567);
        Student student3 = new Student("fitru",9999);

        Boolean actual = Students.getInstance().contains(student);

        Assert.assertTrue(actual);

    }
}
