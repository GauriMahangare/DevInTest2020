package com.aes.devintest.jUnit;

import org.junit.Assert;
import org.junit.Test;

public class AppUtilTest {
    AppUtil appUtil = new AppUtil();

    @Test
    public void add_t1(){
        int actResult = appUtil.add(10,20);
        int expResult = 30;
        Assert.assertEquals(expResult,actResult);
    }
    @Test
    public void add_t2(){
        int actResult = appUtil.add(100,-20);
        int expResult = 120;
        Assert.assertEquals(expResult,actResult);
    }
    @Test
    public void multiply_t1(){
        int actResult = appUtil.multiply(8,6);
        int expResult = 48;
        Assert.assertEquals(expResult,actResult);
    }

}
