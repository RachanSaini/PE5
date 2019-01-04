package com.stackroute;

import java.security.Key;
import java.util.*;

public class MapObject {

    public Map<String,String> modifyMapObject(Map<String,String> input)
    {
        Iterator<Map.Entry<String,String>> itr=input.entrySet().iterator();
        Map.Entry<String,String> firstElement=itr.next();
        Map.Entry<String,String> secondElement=itr.next();
        input.put(firstElement.getKey()," ");
        input.put(secondElement.getKey(),firstElement.getValue());
        return input;
    }

}
