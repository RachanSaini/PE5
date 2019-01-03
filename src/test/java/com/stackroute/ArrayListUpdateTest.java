package com.stackroute;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ArrayListUpdateTest{

    ArrayListUpdate arrayListObject = new ArrayListUpdate();

    @Test
    public void updateArrayListTest(){
        ArrayList<String> inputArrayList = new ArrayList<>();
        inputArrayList.add("Apple");
        inputArrayList.add("Grape");
        inputArrayList.add("Melon");
        inputArrayList.add("Berry");

        ArrayList<String> expectedUpdatedArrayList = new ArrayList<>();
        expectedUpdatedArrayList.add("Kiwi");
        expectedUpdatedArrayList.add("Grape");
        expectedUpdatedArrayList.add("Mango");
        expectedUpdatedArrayList.add("Berry");

        ArrayList<String> actualArrayList = arrayListObject.updatedArrayList(inputArrayList);

        assertEquals(expectedUpdatedArrayList,actualArrayList);


    }

    @Test
    public void failureUpdateArrayListTest(){
        ArrayList<String> inputArrayList = new ArrayList<>();
        inputArrayList.add("Apple");
        inputArrayList.add("Grape");
        inputArrayList.add("Melon");
        inputArrayList.add("Berry");

        ArrayList<String> expectedUpdatedArrayList = new ArrayList<>();
        expectedUpdatedArrayList.add("Apple");
        expectedUpdatedArrayList.add("Grape");
        expectedUpdatedArrayList.add("Mango");
        expectedUpdatedArrayList.add("Berry");

        ArrayList<String> actualArrayList = arrayListObject.updatedArrayList(inputArrayList);

        assertNotEquals(expectedUpdatedArrayList,actualArrayList);


    }

    @Test
    public void deleteArrayListTest(){
        ArrayList<String> inputArrayList = new ArrayList<>();
        



        ArrayList<String> actualArrayList = arrayListObject.deleteArrayList(inputArrayList);

        assertNull(actualArrayList);


    }


}