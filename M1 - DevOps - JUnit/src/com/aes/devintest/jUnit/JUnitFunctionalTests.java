package com.aes.devintest.jUnit;

import org.junit.*;
import org.junit.runners.MethodSorters;
// forcing order on the test execution
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JUnitFunctionalTests {
    /*
    login
    book ticket
    check in
    cancel ticket
    logout
     */
    // gets run only once at the beginning of the class - before any tests are run
    @BeforeClass
    public static void loadTestData(){
        //clear old data
        //load new tickets
        System.out.println("loading test data");
    }
    //will run at the beginning of each test
    @Before
    public void login(){
        System.out.println("Logged in successfully. Begin Test");
    }
    // will run after each test is run
    @Test
    public void bookTicket(){
        System.out.println("Running booking ticket test");
    }
    @Test
    public void checkIn(){
        System.out.println("Running checkIn test");
    }
    @Test
    public void cancel(){
        System.out.println("Running cancel test");
    }


    @After
    public void logout(){
        System.out.println("logged out successfully. Ending Test");
    }
    // runs only once after all tests have run
    @AfterClass
    public static void deleteAllTestRecords(){
        //delete all test records
        System.out.println("deleting test records");
    }


}
