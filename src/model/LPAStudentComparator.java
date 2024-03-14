package model;

import java.util.Comparator;

public class LPAStudentComparator implements Comparator<LPAStudent> {
    @Override
    public int compare(LPAStudent lpaStudent, LPAStudent t1) {
        if (lpaStudent.getPercenteComplete() > t1.getPercenteComplete()){
            return 1;
        }else if (lpaStudent.getPercenteComplete() < t1.getPercenteComplete()){
            return -1;
        }
        return 0;
    }
}
