package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {


    @Given("user navigates to the Facebook website")
    public void user_navigates_to_the_facebook_website() {
        System.out.println("Navigated to Facebook website");
    }

    @When("user validates the homepage title")
    public void user_validates_the_homepage_title() {
        System.out.println("Validated home page title");

    }

    @Then("user enters {string} username")
    public void user_enters_username(String username) {
        System.out.println("Entered username :"+username);

    }

    @Then("user enters {string} password")
    public void user_enters_password(String password) {
        System.out.println("Entered username :"+password);
    }

    @Given("user navigates to the Facebook website of staging")
    public void user_navigates_to_the_facebook_website_of_staging() {
        System.out.println("User navigated to Facebook site of staging");
    }


    @Then("user clicks on the signin button")
    public void user_clicks_on_the_signin_button() {
        System.out.println("Clicked on login button");
    }


    @Given("user navigates to the Demo website")
    public void user_navigates_to_the_demo_website() {
        System.out.println("Navigated to Demo site");
    }
    @When("user validates the homepage title of Demo website")
    public void user_validates_the_homepage_title_of_demo_website() {
        System.out.println("Validated page title of Demo site");
    }
    @Then("user enters {string} username of Demo")
    public void user_enters_username_of_demo(String string) {
        System.out.println("Entered username of demo site");
    }
    @Then("user enters {string} password of Demo")
    public void user_enters_password_of_demo(String string) {
        System.out.println("Entered password of demo site");
    }


}


