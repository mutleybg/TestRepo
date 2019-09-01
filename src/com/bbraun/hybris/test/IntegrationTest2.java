package com.bbraun.hybris.test;

import de.hybris.bootstrap.annotations.IntegrationTest;
import org.junit.Test;

@IntegrationTest
public class IntegrationTest2 {
    @Test
    public void test1(){
        System.out.println("Test2 - test1");
    }

    @Test
    public void test2(){
        System.out.println("Test2 - test2");
    }
}
