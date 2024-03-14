package model;

import java.util.Comparator;

public class LPAStudentComparator implements Comparator<LPAStudent> {
    @Override
    public int compare(LPAStudent lpaStudent, LPAStudent t1) {
        return (int) (lpaStudent.getPercenteComplete() - t1.getPercenteComplete()) ;
    }
}
