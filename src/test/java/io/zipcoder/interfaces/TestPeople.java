package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {
    People people = new People();
    Person person = new Person("Wolverine", 1234);
    Person person2 = new Person("cyclops",4321);
    Person person3 = new Person("rogue", 4567);

    @Test
    public void testAdd(){
        people.add(person);

        Person expected = person;

        Person actual = people.findById(person.id);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testRemove(){
        people.add(person);
        people.add(person2);
        people.add(person3);

        Assert.assertEquals(3,people.count());

        people.remove(person);

        Person expected = person;

        Assert.assertEquals(2,people.count());

    }

    @Test
    public void testFindById(){
        people.add(person);

        long expected = 1234;

        Assert.assertEquals(person,people.findById(1234));
    }
}
