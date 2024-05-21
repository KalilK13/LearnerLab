package learnerslab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeopleTest {

    @Test
    void testAdd() {
        People people = new People();

        Person person1 = new Person("Dan", 1);
        Person person2 = new Person("Sam", 2);
        Person person3 = new Person("Fran", 3);

        people.add(person1);
        people.add(person2);
        people.add(person3);

        Person[] actual = people.toArray();
        Person[] expected = {person1, person2, person3};

        assertArrayEquals(expected, actual);
    }

    @Test
    void testFindByID() {
        People people = new People();

        Person person1 = new Person("Dan", 1);
        Person person2 = new Person("Sam", 2);
        Person person3 = new Person("Fran", 3);

        people.add(person1);
        people.add(person2);
        people.add(person3);

        Person actual = people.findByID(2);
        Person expected = person2;

        assertEquals(expected, actual);
    }

    @Test
    void removeAll() {
        People people = new People();

        Person person1 = new Person("Dan", 1);
        Person person2 = new Person("Sam", 2);
        Person person3 = new Person("Fran", 3);

        people.add(person1);
        people.add(person2);
        people.add(person3);

        people.removeAll();

        Person[] actual = people.toArray();
        Person[] expected = {};
        assertArrayEquals(expected, actual);
    }

    @Test
    void testRemove() {
        People people = new People();

        Person person1 = new Person("Dan", 1);
        Person person2 = new Person("Sam", 2);
        Person person3 = new Person("Fran", 3);

        people.add(person1);
        people.add(person2);
        people.add(person3);

        people.remove(person3);

        Person[] actual = people.toArray();
        Person[] expected = {person1, person2};

        assertArrayEquals(expected, actual);
    }
}