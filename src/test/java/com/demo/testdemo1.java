package com.demo;
import org.testng.annotations.Test;
//import org.apache.log4j.Logger;

import static org.testng.Assert.assertEquals;

public class testdemo1 {
  //  private Logger log = Logger.getLogger(testdemo1.class);

    @Test(groups = {"regression"})
    public void testcase1(){
        assertEquals(1,1);
    }
}
