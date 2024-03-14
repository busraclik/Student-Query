import model.DummyLPAStudentData;
import model.DummyStudentData;
import model.LPAStudent;
import model.Student;
import util.QueryList;


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
        printList(lpaStudentList);

        QueryList<LPAStudent> lpaStudentQueryList = new QueryList<>(lpaStudentList);
        var lpaStudentMatchedList = lpaStudentQueryList
                .matchedList("NAME", "BUSRA")
                .matchedList("COURSE NAME", "JAVA");
        System.out.println("LPA Student Matched List");
        printList(lpaStudentMatchedList);


//        System.out.println("********************");
//
//        System.out.println("Matched STUDENT List");
//        QueryList<Student> qL = new QueryList<>();
//        var mList = qL.matchedList(studentList,"NAME", "EZGI");
//        printList(mList);
//
//

//        System.out.println("**********************");
//
//        DummyLPAStudentData lpaStudentDummy = new DummyLPAStudentData();
//        var lpaStudentList = lpaStudentDummy.createLPAStudents(10);
//        System.out.println("LPA Student List");
//        printList(lpaStudentList);



//        System.out.println("********************");
//
//        System.out.println("Matched LPA STUDENT List");
//        QueryList<LPAStudent> qLPAL = new QueryList<>();
//        var mLPAList = qLPAL
//                .matchedList(lpaStudentList,"PERCENT COMPLETE", "50");
//        //mLPAList.sort(new LPAStudentComparator());
//        printList(mLPAList);


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