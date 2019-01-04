package com.stackroute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListUpdate {

    public ArrayList<String> updatedArrayList(ArrayList<String> inputArrayList){



       if(inputArrayList.contains("Apple")||inputArrayList.contains("Melon")){
           int index = inputArrayList.indexOf("Apple");
           inputArrayList.remove("Apple");
           inputArrayList.add(index,"Kiwi");
           int index2 = inputArrayList.indexOf("Melon");
           inputArrayList.remove("Melon");
           inputArrayList.add(index2,"Mango");
       }

        return inputArrayList;
    }

    public  ArrayList<String> deleteArrayList(ArrayList<String> inputArrayList){

       inputArrayList.clear();
       return inputArrayList;
    }

}
