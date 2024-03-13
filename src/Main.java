import model.DummyData;
import model.LPAStudent;
import model.Student;
import util.QueryList;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        DummyData studentDummy = new DummyData();
        var studentList = studentDummy.createStudents(15);
        System.out.println("Student List");
        printList(studentList);

        System.out.println("**********************");

        DummyData lpaStudentDummy = new DummyData();
        var lpaStudentList = lpaStudentDummy.createLPAStudents(5);
        System.out.println("LPA Student List");
        printList(lpaStudentList);

        System.out.println("********************");

        System.out.println("Matched STUDENT List");
        QueryList<Student> qL = new QueryList<>();
        var mList = qL.matchedList(studentList,"NAME", "EZGI");
        printList(mList);

        System.out.println("********************");

        System.out.println("Matched LPA STUDENT List");
        QueryList<LPAStudent> qLPAL = new QueryList<>();
        var mLPAList = qL.matchedList(lpaStudentList,"PERCENT COMPLETE", "10");
        printList(mLPAList);



    }


    public static void printList(List<?> list){
        if (list.isEmpty()){
            System.out.println("No Result Found");
        }
        for (var item : list) {
            System.out.println(item);
        }
    }


}