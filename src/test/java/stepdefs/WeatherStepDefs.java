package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class WeatherStepDefs {

    @Given("city id: {long}")
    public void set_city_id(long cityId) {

    }

    @When("we are requesting weather data")
    public void weather_request() {

    }

    @Then("coords are:")
    public void check_coords(Map<String, Double> params) {
        params.get("lon"); // -> 145.77
        params.get("lat"); // -> -16.92
    }

    @Then("weather is:")
    public void check_weather(Map<String, String> params) {
        Long.parseLong(params.get("id")); // we transform string to long
        Double.parseDouble(params.get("id")); // we transform string to double
        Integer.parseInt(params.get("id")); // we transform string to int
        params.get("main");
        params.get("description");
        params.get("icon");
    }

    @Then("base is: {string}")
    public void check_base(String base) {

    }

    @Then("main is:")
    public void check_main(Map<String, String> params) {
        Double.parseDouble(params.get("temp"));
        Integer.parseInt(params.get("pressure"));
        Integer.parseInt(params.get("humidity"));
        Double.parseDouble(params.get("temp_min"));
        Double.parseDouble(params.get("temp_max"));
    }

    @Then("visibility is: {int}")
    public void check_visibility(int visibility) {

    }

    @Then("wind is:")
    public void check_wind(Map<String, String> params) {
        Double.parseDouble(params.get("speed"));
        Integer.parseInt(params.get("deg"));
    }

    @Then("clouds are:")
    public void check_cloud(Map<String, Integer> params) {
        params.get("all");
    }

    @Then("dt is: {int}")
    public void check_dt(int dt) {

    }

    @Then("sys is:")
    public void check_sys(Map<String, String> params) {
        Integer.parseInt(params.get("type"));
        Long.parseLong(params.get("id"));
        Double.parseDouble(params.get("message"));
        params.get("country");
        Long.parseLong(params.get("sunrise"));
        Long.parseLong(params.get("sunset"));
    }

    @Then("id is: {long}")
    public void check_id(long id) {

    }

    @Then("name is: {string}")
    public void check_name(String name) {

    }

    @Then("cod is: {int}")
    public void check_cod(int cod) {

    }
}
