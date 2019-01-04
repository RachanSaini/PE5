package com.stackroute;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayListUpdateTest{

    private ArrayListUpdate arrayListObject;
    private ArrayListUpdateTest test;


    @Before
    public void beforeClass(){
        arrayListObject = new ArrayListUpdate();
        test = new ArrayListUpdateTest();

    }

    @Test
    public void updateArrayListTest(){
        ArrayList<String> inputArrayList= new ArrayList<String>(Arrays.asList(new String[]{"Apple", "Grape", "Melon","Berry"}));


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
        ArrayList<String> inputArrayList= new ArrayList<String>(Arrays.asList(new String[]{"Apple", "Grape", "Melon","Berry"}));


        ArrayList<String> expectedUpdatedArrayList = new ArrayList<>();
        expectedUpdatedArrayList.add("Apple");
        expectedUpdatedArrayList.add("Grape");
        expectedUpdatedArrayList.add("Mango");
        expectedUpdatedArrayList.add("Berry");

        ArrayList<String> actualArrayList = arrayListObject.updatedArrayList(inputArrayList);

        assertNotEquals(expectedUpdatedArrayList,actualArrayList);


    }

    @Test
    public void deleteArrayList(){
        ArrayList<String> inputArrayList= new ArrayList<String>(Arrays.asList(new String[]{"Apple", "Grape", "Melon","Berry"}));
        ArrayList<String> expectedUpdatedArrayList = new ArrayList<>();
        ArrayList<String> actualArrayList = arrayListObject.deleteArrayList(inputArrayList);

        assertEquals(expectedUpdatedArrayList,actualArrayList);




    }




}