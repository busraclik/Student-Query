package model;

import java.util.ArrayList;
import java.util.List;

public class DummyLPAStudentData extends DummyStudentData{

    public List<LPAStudent> createLPAStudents(int numberStudent){
        List<LPAStudent> lpaStudents = new ArrayList<>();
        for (int i=0; i<numberStudent; i++){
            lpaStudents.add(new LPAStudent(randomName(),randomCourse(),randomYear(),randomProcess()));
        }
        return lpaStudents;
    }


    private double randomProcess(){
        return random.nextDouble(0.00, 100.01);
    }

}
