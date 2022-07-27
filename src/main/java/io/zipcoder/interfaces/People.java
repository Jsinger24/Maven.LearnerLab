package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class People {

    List<Person> personList = new ArrayList<>();

    public void add(Person person){
        this.personList.add(person);
    }

    public Person findById(long id){
        for (Person person: personList) {
            if(person.getId() == id){
                return person;
            }
        }
        return null;
    }
}
