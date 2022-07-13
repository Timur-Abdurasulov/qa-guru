package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class HelloWorldStepDefs {

    private int alexApplesCount;
    private int jekaterinaApplesCount;
    private int applesTotalCount;

    @Given("Alex has {int} apples")
    public void set_apples_for_alex(int count) {
        System.out.println("Alex has " + count + " apples.");
        alexApplesCount = count;
    }

    @Given("Jekaterina has {int} apples")
    public void set_apples_for_jekaterina(int count) {
        System.out.println("Jekaterina has " + count + " apples.");
        jekaterinaApplesCount = count;
    }

    @When("they are putting all apples together")
    public void put_apples_together() {
        applesTotalCount = alexApplesCount + jekaterinaApplesCount;
        System.out.println("Apples total count is " + applesTotalCount);
    }

    @Then("they have {int} apples")
    public void check_apples_count(int count) {
        System.out.println("Checking if total count is OK...");
        Assertions.assertEquals(count, applesTotalCount, "Wrong total count!");
        System.out.println("Total count is OK!");
    }
}