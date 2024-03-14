package util;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class QueryList <T extends Student> extends ArrayList<T> {

    public QueryList(){

    }
    public QueryList(List<T> items){
        super(items);
    }

    public QueryList<T> matchedList(String fieldName, String value){
        QueryList<T> matchedList = new QueryList<>();
        for (var item : this) {
            if (item.isMatched(fieldName, value)){
                matchedList.add(item);
            }
        }
        return matchedList;
    }















//    public QueryList(){
//
//    }
//    public QueryList(List<T> items){
//        super(items);
//        //this.items = items;
//    }
//
//    public QueryList<T> matchedList(List<T> list, String fieldName, String value){
//        QueryList<T> matchedList = new QueryList<>();
//        for (var item : list) {
//            if (item.isMatched(fieldName, value)){
//                matchedList.add(item);
//            }
//        }
//        return matchedList;
//    }
//
//    public QueryList<T> getMatches(String fieldName, String value){
//        QueryList<T> matchedList = new QueryList<>();
//        for (var item : this) {
//            if (item.isMatched(fieldName, value)){
//                matchedList.add(item);
//            }
//        }
//        return matchedList;
//    }



}
