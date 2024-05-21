package learnerslab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testLearn() {
        double studyTime = 5;
        Student student = new Student("Wally", 4);
        student.learn(studyTime);
        double actual = student.getTotalStudyTime();

        assertEquals(actual, studyTime);
//        return student.getTotalStudyTime() == studyTime;
    }

    @Test
    void testImplementation() {
        Student student = new Student("Mike", 2);
        assertTrue(student instanceof Learner);
    }
    @Test
    void testInheritance() {
        Student student = new Student("Mike", 2);
        assertTrue(student instanceof Person);
    }
}