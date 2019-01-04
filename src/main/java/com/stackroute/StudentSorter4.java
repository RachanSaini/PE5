package com.stackroute;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentSorter4 implements Comparator<Student4>{


    @Override
    public int compare(Student4 o1, Student4 o2) {
        if(o1.getAge()<o2.getAge()){
            return 1;
        }else if(o1.getAge() == o2.getAge()){
            return compareSecondTimeNames(o1,o2);
        }
        return -1;
    }
    private int compareSecondTimeNames(Student4 o1,Student4 o2){
        if(o1.getName().compareTo(o2.getName())<0){
            return -1;
        }else if(o1.getName().compareTo(o2.getName())==0){
            return compareThirdTimeIds(o1,o2);
        }
        return 1;
    }
    private int compareThirdTimeIds(Student4 o1,Student4 o2){
        if(o1.getId()<o2.getId()){
            return 1;
        }else
            return -1;
    }
}
