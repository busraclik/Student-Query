import model.*;
import util.QueryList;


import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        DummyStudentData studentDummy = new DummyStudentData();
        var studentList = studentDummy.createStudents(15);
        System.out.println("Student List");
        printList(studentList);


        QueryList<Student> studentQueryList = new QueryList<>(studentList);
        var studentMatchedList = studentQueryList.
                matchedList("NAME", "BUSRA")
                .matchedList("COURSE NAME", "JAVA");
        System.out.println("Student Matched List");
        printList(studentMatchedList);


        System.out.println("******************");
        DummyLPAStudentData dummyLPAStudentData = new DummyLPAStudentData();
        var lpaStudentList = dummyLPAStudentData.createLPAStudents(15);
        System.out.println("Lpa Student List");
        lpaStudentList.sort(new LPAStudentComparator());
        //Collections.sort(lpaStudentList);
        printList(lpaStudentList);


//        QueryList<LPAStudent> lpaStudentQueryList = new QueryList<>(lpaStudentList);
//        var lpaStudentMatchedList = lpaStudentQueryList
//                .matchedList("NAME", "BUSRA")
//                .matchedList("COURSE NAME", "JAVA");
//        System.out.println("LPA Student Matched List");
//        printList(lpaStudentMatchedList);
//

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