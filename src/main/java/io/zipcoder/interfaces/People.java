package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
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

    public Boolean contains(Person person){
        if(personList.contains(person)){
            return true;
        }
        return null;
    }

    public void remove(Person person) {

        for (int i = 0; i < personList.size(); i++) {
            if (person == personList.get(i)) {
                personList.remove(personList.get(i));
            }
        }
    }

    public void remove(long id){
        for (int i = 0; i < personList.size(); i++){
            if (id == personList.get(i).getId()){
                personList.remove(personList.get(i));
            }
        }
    }

    public void removeAll(){
        personList.clear();
    }

    public int count(){
        return personList.size();
    }

    public void toArray(){
        personList.toArray();
    }

    public void iterator(){
//        Iterator<E> iterator = new Iterator<E>() {
//            @Override
//            public boolean hasNext() {
//                return false;
//            }
//
//            @Override
//            public E next() {
//                return null;
//            }
//        }

    }




}
