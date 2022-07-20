package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor(){

        String expectedName = "Arnold";
        long expectedId = 69;

        Person test = new Person(expectedName, expectedId);

        Assert.assertEquals(expectedName, test.getName());
        Assert.assertEquals(expectedId, test.getId());
    }


}
