package pages;

import org.testng.annotations.*;

public class A {
    @BeforeMethod
    public void beforeMethod(){

        System.out.println("I AM BEFORE METHOD BBBBBB");
    }

    @AfterMethod
    public void afterMethod(){

        System.out.println("I AM AFTER METHOD BBBBBB");
    }
    @BeforeClass
    public void  beforeClass(){

        System.out.println("I AM BEFORE CLASS BBBBBB");
    }
    @AfterClass
    public void afterClas(){
        System.out.println("I AM AFTER CLASSS BBBBBB");

    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("I AM BEFORE TEST BBBBBB");
    }
    @AfterTest
    public void afterMthodTest(){
        System.out.println("I AM AFTER TEST BBBBBB");
    }
    @Test
    public void testBBB(){
        System.out.println("I AM TEST BBBBBB");

    }
}
