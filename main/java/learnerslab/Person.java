package learnerslab;

public class Person {
    private final long ID;
    private String name;

    public Person(String name, long id) {
        this.name = name;
        this.ID = id;
    }

    public long getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
