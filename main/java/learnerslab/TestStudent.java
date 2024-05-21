package learnerslab;


public class TestStudent {
    public boolean testImplementation(){
        Student student = new Student("Mike", 2);
        return student instanceof Learner;
    }
    public boolean testInheritance(){
        Student student = new Student("Cid", 3);
        return  student instanceof Person;

    }
    public boolean testLearn(){
        double studyTime = 5;
        Student student = new Student("Wally", 4);
        student.learn(studyTime);
        return student.getTotalStudyTime() == studyTime;
    }
}
