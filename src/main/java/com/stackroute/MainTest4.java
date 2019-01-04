package com.stackroute;

import java.util.*;

public class MainTest4 {

    public static void main(String[] args) {

        StudentSorter4 sorterObject = new StudentSorter4();

        Student4 student1 = new Student4(1, "Smily", 22);
        Student4 student2 = new Student4(2, "Karan", 20);
        Student4 student3 = new Student4(3, "Karan", 21);
        Student4 student4 = new Student4(4, "Smily", 22);
        Student4 student5 = new Student4(5, "Simran", 19);

        List<Student4> inputStudentList = new ArrayList<Student4>(Arrays.asList(new Student4[]{student1, student2, student3, student4, student5}));
        Iterator<Student4> itr = inputStudentList.iterator();
        Comparator com = new StudentSorter4();


        Collections.sort(inputStudentList,com);

        for (Student4 o : inputStudentList) {
            System.out.println(o.getId() + " " + o.getName() + " " + o.getAge());
        }


    }

}
