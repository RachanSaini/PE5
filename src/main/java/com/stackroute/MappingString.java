package com.stackroute;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MappingString {

    public Map<String,Integer> countMap(String input){
       String[] inputArray = input.split("[^a-z]+");
       Map<String,Integer> result = new HashMap<String, Integer>();

       for(String str : inputArray)
       {
           if(result.containsKey(str)){
               //count ++;
               result.put(str, result.get(str)+1);
           }
           else
           {
               result.put(str, 1);
           }




       }


        return result;

    }
}
