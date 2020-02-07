package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BinarySearchTest {

    BinarySearch binarySearch;

    @Before
    public void BeforeRun(){
        BinarySearch binarySearch = new BinarySearch();
        int result = binarySearch.BinarySearchIteration();
    }
    @Test
    public void TDDTest(){
       // BinarySearch binarySearch = new BinarySearch();
        int result = binarySearch.BinarySearchIteration();
        assertEquals(-1,result);
    }

    //Mock
    @Test
    public void MockTest(){
        int []arr={6,2,3,4,5,6,7,8};
        InputReader input = new InputReader();
        input = mock(InputReader.class);
        when(input.readfiles("input.txt")).thenReturn(arr);
       // BinarySearch binarySearch = new BinarySearch();
        int x = binarySearch.BinarySearchIteration();
        assertEquals(-1,x);
    }

   @After
    public void AfterRun(){
        System.out.println("Congratulations, Successfully Passed All Test Case.");
    }

}
