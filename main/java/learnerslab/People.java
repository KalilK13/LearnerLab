package learnerslab;

import java.util.ArrayList;
import java.util.Iterator;

public class People implements Iterable<Person>{
    private ArrayList<Person> personList = new ArrayList<>();

    public void add(Person person){
        personList.add(person);
    }
    public Person findByID(long id){
        for(Person person : personList){
            if(person.getID() == id){
                return person;
            }
        }
        return null;
    }
    public boolean contains(Person person){
        for(Person p : personList){
            if(p.equals(person)){
                return true;
            }
        }
        return false;
    }
    public void remove(Person person){
        Person[] people = personList.toArray(new Person[0]);
        for(Person p : people){
            if (p.equals(person)){
                personList.remove(p);
            }
        }
    }
    public void remove(long id){
        Person[] people = personList.toArray(new Person[0]);
        for(Person p : people){
            if (p.getID() == id){
                personList.remove(p);
            }
        }
    }
    public void removeAll(){
        Person[] people = personList.toArray(new Person[0]);
        for(Person p : people){
            personList.remove(p);
        }
    }
    public int count(){
        return personList.size();
    }
    public Person[] toArray(){
        return personList.toArray(new Person[personList.size()]);
    }

    @Override
    public Iterator<Person> iterator() {
        return personList.iterator();
    }
}
