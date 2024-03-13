package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DummyData {

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

    public List<LPAStudent> createLPAStudents(int numberStudent){
        List<LPAStudent> lpaStudents = new ArrayList<>();
        for (int i=0; i<numberStudent; i++){
            lpaStudents.add(new LPAStudent(randomName(),randomCourse(),randomYear(),randomProcess()));
        }
        return lpaStudents;
    }


    private String randomName(){
        return names[random.nextInt(names.length)];
    }

    private String randomCourse(){
        return courses[random.nextInt(courses.length)];
    }
    private int randomYear(){
        return random.nextInt(2019, 2025);
    }

    private double randomProcess(){
        return random.nextDouble(0.00, 100.01);
    }
}
