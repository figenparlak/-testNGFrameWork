package pages;

import org.testng.annotations.*;

public class B extends A{
    @BeforeMethod
    public void beforeMethod(){

        System.out.println("I AM BEFORE METHOD AAAAA");
    }

    @AfterMethod
    public void afterMethod(){

        System.out.println("I AM AFTER METHOD AAAAAA");
    }
    @BeforeClass
    public void  beforeClass(){

        System.out.println("I AM BEFORE CLASS AAAAAA");
    }
    @AfterClass
    public void afterClas(){
        System.out.println("I AM AFTER CLASSS AAAAA");

    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("I AM BEFORE TEST AAAAA");
    }
    @AfterTest
    public void afterMthodTest(){
        System.out.println("I AM AFTER TEST AAAAA");
    }
    @Test
    public void testBBB(){
        System.out.println("I AM TEST AAAAA");

    }
}
