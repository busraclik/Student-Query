package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DummyStudentData {

    private static String[] names = {"BUSRA", "NESLIHAN", "EZGI", "DURU", "SIMGE", "PINAR", "DERIN"};
    private static String[] courses = {"JAVA", "PYTHON", "C#"};

    Random random = new Random();

    public List<Student> createStudents(int numberStudent){
        List<Student> students = new ArrayList<>();
        for (int i=0; i<numberStudent; i++){
            students.add(new Student(randomName(),randomCourse(),randomYear()));
        }
        return students;
    }


    protected String randomName(){
        return names[random.nextInt(names.length)];
    }

    protected String randomCourse(){
        return courses[random.nextInt(courses.length)];
    }
    protected int randomYear(){
        return random.nextInt(2019, 2025);
    }

}
