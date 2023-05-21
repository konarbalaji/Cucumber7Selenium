package steps;

import io.cucumber.java.*;
import org.testng.annotations.BeforeSuite;

public class Hooks {

    //Suite level
    @BeforeAll()
    public static void before_all(){
        System.out.println("BEFOREALL - Create DB connection");
    }

    //Suite level
    @AfterAll
    public static void afterAll(){
        System.out.println("AFTERALL - Release DB connection");
    }

    //Scenario level
    @Before("@staging")
    public void setup(){
        System.out.println("SETUP - @Before hook - Launching browser");
    }

    //Scenario level
    @Before("@staging")
    public void setup1(){
        System.out.println("SETUP - @Before hook - Launching browser1");
    }

    //Scenario level
    @After(order = 1)
    public void tearDown(){
        System.out.println("TEARDOWN - @After hook - Quit browser");
    }

    //Scenario level
    @After(order = 0)
    public void tearDown1(){
        System.out.println("TEARDOWN - @After hook - Quit browser1");
    }

    //step level
    @BeforeStep
    public void beforeStep(){
        System.out.println("Before step - Adding a log");
    }

    //step level
    @AfterStep
    public void afterStep(){
        System.out.println("After step - deleting a log");
    }

}