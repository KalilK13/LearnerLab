package learnerslab;

public class TestPerson {

    public boolean testConstructor(){
        String name = "Mike";
        long id = 123;
        Person person1 = new Person(name, id);
        return person1.getName() == name && person1.getID() == id;
    }
    public boolean testSetName(){
        String name = "Nusrat";
        Person person = new Person("Ben", 1);
        person.setName("Nusrat");
        return person.getName() == name;
    }
}
