package com.evozonintern.Suits;


import com.evozonintern.tests.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AddToCartTest.class,
        CreateNewAccountTest.class,
        CreateNewAccountTestUsingDDT.class,
        LoginTest.class,
        LoginTestUsingDDT.class
})
public class RunAllTestsSuits {



}
