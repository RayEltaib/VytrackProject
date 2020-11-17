package com.vytrack.step_definitions;

import com.vytrack.pages.CalendarEvent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalendarEvent_StepDefinitions {

    CalendarEvent calendarEvent = new CalendarEvent();

    @Given("user navigates to {string} and {string}")
    public void user_navigates_to_and(String string, String string2) {
        calendarEvent.navigationGlobal(string, string2);
    }



    @When("user hovers on three dots for {string}")
    public void user_hovers_on_three_dots_for(String string) {

        calendarEvent.gridButtonsClick("Filters");
        calendarEvent.filtersOptionsClick("Title");
        calendarEvent.filterByTitleName(string);

    }
    @Then("{string}, {string} and {string} options are available")
    public void and_options_are_available(String string, String string2, String string3) {
            calendarEvent.threeDotButtonsConfirmation(string, string2, string3);
    }

}
