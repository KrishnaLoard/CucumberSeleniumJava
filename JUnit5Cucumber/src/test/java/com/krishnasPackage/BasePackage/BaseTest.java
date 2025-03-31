package com.krishnasPackage.BasePackage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    @BeforeEach
    public void setUpMethod(){
        System.out.println("Before Each TestCase Method");
    }

    @AfterEach
    public void disposeMethod(){
        System.out.println("Dispose Method After Each Test Case");
    }

}
