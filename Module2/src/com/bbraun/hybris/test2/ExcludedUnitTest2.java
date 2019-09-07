package com.bbraun.hybris.test2;

import de.hybris.bootstrap.annotations.UnitTest;
import org.junit.Test;

@UnitTest
public class ExcludedUnitTest2 {
    @Test
    public void test1(){
        System.out.println("Test1 - test1");
    }

    @Test
    public void test2(){
        System.out.println("Test1 - test2");
    }
}
