package com.stackroute;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class MapObjectTest {

    private MapObject object;
    private Map<String,String> inputMap;

    @Before
    public void before(){
        object = new MapObject();
        inputMap = new HashMap<String, String>();

    }

    @Test
    public void checkModifyMapObject(){
       inputMap.put("val1","java");
       inputMap.put("val2","c++");

        Map<String,String> expectedMap = new HashMap<String, String>();
        inputMap.put("val1"," ");
        inputMap.put("val2","java");

    }

    @Test
    public void checkModifyMapObject2(){
        inputMap.put("val1","mars");
        inputMap.put("val2","saturn");

        Map<String,String> expectedMap = new HashMap<String, String>();
        inputMap.put("val1"," ");
        inputMap.put("val2","mars");

    }

}