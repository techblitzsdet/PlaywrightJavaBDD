package steps;

import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;


public class LoginProdSteps {

    @Then("I validate captcha image")
    public void i_validate_captcha_image() {
        System.out.println("I validate captcha image");
    }

    @Then("user enters firstName and lastName")
    public void user_enters_first_name_and_last_name(io.cucumber.datatable.DataTable dataTable) {

        /*List<List<String>> data=dataTable.asLists();

        System.out.println("First Name is : " +data.get(0).get(0) +    "Last Name is "+data.get(0).get(1));
        System.out.println("First Name is : " +data.get(1).get(0) +     "Last Name is "+data.get(1).get(1));
        */

        /*List<Map<String,String>> maps=dataTable.asMaps();

        System.out.println(maps.get(0).get("firstName")+   "   Last Name  is : " +maps.get(0).get("lastName"));
        System.out.println(maps.get(1).get("firstName")+   "   Last Name  is : " +maps.get(1).get("lastName"));

         */

        for(Map<String,String> maps:dataTable.asMaps(String.class,String.class)){

            System.out.println("FirstName is : "+maps.get("firstName") + " Last Name is : "+maps.get("lastName"));

        }


    }

//    @Then("user enters firstName and lastName")
//    public void user_enters_first_name_and_last_name(io.cucumber.datatable.DataTable dataTable) {
//
//        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
//
//        for (Map<String, String> row : rows) {
//            System.out.println("First Name is: " + row.get("firstName")
//                    + ", Last Name is: " + row.get("lastName"));
//        }
//
//    }

}
