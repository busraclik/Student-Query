package model;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student student, Student t1) {
        if (student.getYearStarted() > t1.getYearStarted()){
            return 1;
        } else if (student.getYearStarted() < t1.getYearStarted()) {
            return -1;
        }
        return 0;
    }
}
