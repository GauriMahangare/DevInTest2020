package com.aes.devintest.jUnit;

import org.junit.Ignore;
import org.junit.Test;

public class junitDemo {
    // use test annotation for each test case
    // all methods are public
    @Test
    public void  test1(){
        startTest();
        System.out.println("running test 1");
    }
    // ignore annotation to ignore method
    @Ignore
    public void  test2(){
        startTest();
        System.out.println("running test 2");
    }

    @Test
    public void  test3(){
        startTest();
        System.out.println("running test 3");
    }
    private void startTest(){
        System.out.println("start test");
    }

}
