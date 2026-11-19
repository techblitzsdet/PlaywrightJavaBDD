package steps;

import io.cucumber.java.*;

public class Hooks {


    @Before("@staging")
    public void setUp(){
        System.out.println("@Before Hook : Launching Browser 0");

    }



    @After("@staging")
    public void tearDown(){
        System.out.println("@After Hook : Quitting browser 0");

    }


    @BeforeAll
    public static void before_all(){
        System.out.println("Before All : hooks : DB connected started");

    }

    @AfterAll
    public static void after_all(){
        System.out.println("After all : hooks : DB connection closed");

    }

    @BeforeStep
    public void before_step(){
        System.out.println("Before Step : hooks started");
    }

    @AfterStep
    public void after_step(){
        System.out.println("After Step : hooks after step");
    }

}
