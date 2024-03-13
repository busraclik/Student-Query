package model;

public class LPAStudent extends Student{

    private double percenteComplete;

    public LPAStudent(String name, String courseName, int yearStarted, double percenteComplete) {
        super(name, courseName, yearStarted);
        this.percenteComplete = percenteComplete;
    }

    @Override
    public boolean isMatched(String fieldName, String value) {
        if (fieldName.equalsIgnoreCase("PERCENT COMPLETE")){
            return percenteComplete <= Double.parseDouble(value);
        }
        return false;
    }

    @Override
    public String toString() {
        return "%s %8.1f%%".formatted(super.toString(), percenteComplete);
    }
}
