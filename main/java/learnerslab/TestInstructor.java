package learnerslab;

public class TestInstructor {
    public boolean testImplementation(){
        Instructor instructor = new Instructor("Dan", 88);
        return instructor instanceof Teacher;
    }
    public boolean testInheritance(){
        Instructor instructor = new Instructor("Sasha", 43);
        return instructor instanceof Person;
    }
    public boolean testTeach(){
        double hoursTaught = 10;
        Instructor instructor = new Instructor("Kenneth", 13);
        Student student = new Student("Wendy", 50);
        instructor.teach(student, hoursTaught);

        return student.getTotalStudyTime() == hoursTaught;
    }
    public boolean testLecture(){
        double hoursTaught = 10;
        Instructor instructor = new Instructor("Mandy", 99);
        Student student1 = new Student("Carl", 102);
        Student student2 = new Student("Sara", 103);
        Learner[] learners = {student1, student2};

        instructor.lecture(learners, hoursTaught);

        for (int i = 0; i < learners.length; i++){
            if(learners[i].getTotalStudyTime() == hoursTaught/ learners.length){
                if(i == learners.length - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
