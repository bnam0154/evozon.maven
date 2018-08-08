package com.evozonintern.Suits;


import com.evozonintern.tests.AddToCartTest;
import com.evozonintern.tests.CreateNewAccountTest;
import com.evozonintern.tests.LoginTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CreateNewAccountTest.class,
        LoginTest.class,
        AddToCartTest.class
})
public class RegisterAndLoginSuits {



}
