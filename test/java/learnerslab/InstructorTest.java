package learnerslab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstructorTest {
    @Test
    void testImplementation(){
        Instructor instructor = new Instructor("Dan", 88);
        assertTrue(instructor instanceof Teacher);
    }
    @Test
    void testInheritance(){
        Instructor instructor = new Instructor("Sasha", 43);
        assertTrue(instructor instanceof Person);
    }

    @Test
    void testTeach() {
        double hoursTaught = 10;
        Instructor instructor = new Instructor("Kenneth", 13);
        Student student = new Student("Wendy", 50);
        instructor.teach(student, hoursTaught);

        double actual = student.getTotalStudyTime();
        double expected = hoursTaught;

        assertEquals(expected, actual);
    }

    @Test
    void testLecture() {
        double hoursTaught = 10;
        Instructor instructor = new Instructor("Mandy", 99);
        Student student1 = new Student("Carl", 102);
        Student student2 = new Student("Sara", 103);
        Learner[] learners = {student1, student2};

        instructor.lecture(learners, hoursTaught);

        for (int i = 0; i < learners.length; i++){
            if(learners[i].getTotalStudyTime() == hoursTaught/ learners.length){
                if(i == learners.length - 1) {
                    assert true;
                }
            }
            else {
                assert false;
            }
        }
    }
}