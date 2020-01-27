package com.sophos.test.stepdefinitions.gorest;

import com.sophos.test.models.gorest.ClientData;
import com.sophos.test.questions.gorest.GetDataUser;
import com.sophos.test.questions.gorest.GetStatusCode;
import com.sophos.test.tasks.gorest.MakeRequest;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class GetClientStepDefinitions {

    private ClientData clientData;

    @Before
    public void InitialConfiguration() {
        setTheStage(new OnlineCast());
        OnStage.theActorCalled("SophosClient");
    }

    @Given("That the user calls the service with the token {string}")
    public void thatTheUserCallsTheServiceWithTheToken(String token) {
        theActorInTheSpotlight().wasAbleTo(MakeRequest.toServices(token));
    }

    @When("Make a request to find the customer with ID {string}")
    public void makeARequestToFindTheCustomerWithID(String id) {
        clientData = new GetDataUser().answeredBy(theActorInTheSpotlight()).getClientData().stream().filter(x -> x.getId().equals(id)).findFirst().orElse(null);
    }

    @Then("The status code must be {int}")
    public void theStatusCodeIs(Integer statusCode) {
        theActorInTheSpotlight().should(seeThat("Response code", GetStatusCode.was(), equalTo(statusCode)));
    }

    @Then("Response should includes the following")
    public void iShouldSeeTheClientFirstNameAs(Map<String, String> datosSimulador) {
        theActorInTheSpotlight().should(seeThat("The user is not null", act -> clientData, notNullValue()));
        theActorInTheSpotlight().should(seeThat("user's name", act -> clientData.getFirstName(), equalTo(datosSimulador.get("First_Name"))));
        theActorInTheSpotlight().should(seeThat("user's surname", act -> clientData.getLastName(), equalTo(datosSimulador.get("Last_Name"))));
        theActorInTheSpotlight().should(seeThat("user gender", act -> clientData.getGender(), equalTo(datosSimulador.get("Gender"))));
        theActorInTheSpotlight().should(seeThat("user email", act -> clientData.getEmail(), equalTo(datosSimulador.get("Email"))));

    }
}
