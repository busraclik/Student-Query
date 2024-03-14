package model;

import java.util.Comparator;

public class LPAStudent extends Student {

    private double percenteComplete;

    public LPAStudent(String name, String courseName, int yearStarted, double percentComplete) {
        super(name, courseName, yearStarted);
        this.percenteComplete = percentComplete;
    }

    @Override
    public boolean isMatched(String fieldName, String value) {

        if (fieldName.equalsIgnoreCase("PERCENT COMPLETE")){
            return percenteComplete <= Double.parseDouble(value);
        }
        return super.isMatched(fieldName, value);
    }


    @Override
    public String toString() {
        return "%s %8.1f%%".formatted(super.toString(), percenteComplete);
    }

    public double getPercenteComplete() {
        return percenteComplete;
    }
}
