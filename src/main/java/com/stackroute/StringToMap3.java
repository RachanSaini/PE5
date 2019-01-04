package com.stackroute;

import java.util.HashMap;
import java.util.Map;

public class StringToMap3 {

    public Map<String,Boolean> stringToMap(String[] input){

        Map<String,Boolean> result = new HashMap<>();
        for(String str : input){

            if(result.containsKey(str)){
                //count ++;
                result.put(str,true);
            }
            else
            {
                result.put(str, false);
            }

        }


        return result;
    }
}
