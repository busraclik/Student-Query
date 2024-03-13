package util;

import model.Student;

import java.util.ArrayList;
import java.util.List;


public class QueryList <T extends Student> extends ArrayList<T> {

    public <T extends Student> QueryList<T> matchedList(List<T> list, String fieldName, String value){
        QueryList<T> matchedList = new QueryList<>();
        for (var item : list) {
            if (item.isMatched(fieldName, value)){
                matchedList.add(item);
            }
        }
        return matchedList;
    }


}
