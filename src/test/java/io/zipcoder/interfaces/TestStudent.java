package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation() {

        String expectedName = "Chuckie";
        long expectedId = 24;

        Person test = new Person(expectedName, expectedId);

        Assert.assertEquals(expectedName, test.getName());
        Assert.assertEquals(expectedId, test.getId());


    }
    @Test
        public void testInheritance(){

            String expected = "Suzie";
            long expectedId = 40;

            Person inheritTest = new Student(expected,expectedId);

            Assert.assertEquals(expected, inheritTest.getName());

            Assert.assertEquals(expectedId, inheritTest.getId());


        }


//    @Test
////    public void testLearn(){
////
//////        Double expectedNumberOfHours = 10.0;
//////
//////        Student test = new Student("JD", 1234);
//////
//////        test.learn(expectedNumberOfHours);
//////
//////        Assert.assertEquals(expectedNumberOfHours,test.getTotalStudyTime());
////
////
////    }
}
