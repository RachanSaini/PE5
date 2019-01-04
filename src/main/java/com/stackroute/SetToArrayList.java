package com.stackroute;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SetToArrayList {

    public Set<String> sortSet(Set<String> input){

        TreeSet<String> result=new TreeSet<>(input);
        return result;
    }

    public  ArrayList<String> convertSet(Set<String> input){

        int n = input.size();
        ArrayList<String> result = new ArrayList<String>(n);
        for (String str : input) {
            result.add(str);
        }
        return result;
    }
}
