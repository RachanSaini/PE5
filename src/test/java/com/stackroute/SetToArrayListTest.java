package com.stackroute;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class SetToArrayListTest {

    private SetToArrayList object;
    private Set<String> inputSet;

    @Before
    public void before(){
        object = new SetToArrayList();
        inputSet = new HashSet<>(Arrays.asList("Harry","Olive","Alice","Bluto","Eugene"));
    }

    @Test
    public void checkSortSet(){
        Set<String> expectedSet = new HashSet<>(Arrays.asList("Alice","Bluto","Eugene","Harry","Olive"));
        Set<String> actualSet = object.sortSet(inputSet);
        assertEquals(expectedSet,actualSet);

    }

    @Test
    public void checkConvertSet(){
        List<String> expectedArrayList = new ArrayList<>(Arrays.asList("Alice","Bluto","Eugene","Harry","Olive"));
        ArrayList<String> actualList = object.convertSet(object.sortSet(inputSet));
        assertEquals(expectedArrayList,actualList);

    }

}