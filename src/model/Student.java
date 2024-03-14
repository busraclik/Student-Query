package model;

public class Student {
    private static int LAST_ID = 10_000;
    private int studentId;
    private String name;
    private String courseName;
    private int yearStarted;

    public Student(String name, String courseName, int yearStarted) {
        this.studentId = LAST_ID++;
        this.name = name;
        this.courseName = courseName;
        this.yearStarted = yearStarted;
    }


    public boolean isMatched(String fieldName, String value){
        String fName = fieldName.toUpperCase();
        return switch (fName){
            case "NAME" -> name.equalsIgnoreCase(value);
            case "COURSE NAME" -> courseName.equalsIgnoreCase(value);
            case "STARTED YEAR" -> yearStarted == Integer.parseInt(value);
            default -> false;
        };
    }


    @Override
    public String toString() {
        return "%d %-15s %-15s %d".formatted(studentId,name,courseName,yearStarted);
    }


}
