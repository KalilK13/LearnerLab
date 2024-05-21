package learnerslab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void testConstructor(){
        String name = "Mike";
        long id = 123;
        Person person = new Person(name, id);
        assertTrue(person.getName() == name && person.getID() == id);
    }

    @Test
    void testSetName(){
        String name = "Nusrat";
        Person person = new Person("Ben", 1);
        person.setName("Nusrat");

        assertTrue(person.getName() == name);
    }
}