package com.reto.automatizacion.stepdefinitions.plazavea;

import com.reto.automatizacion.tasks.plazavea.OpenPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddProductStepDefinitions {

    @Before
    public void InitialConfiguration(){
        setTheStage(new OnlineCast());
        OnStage.theActorCalled("The client");
    }

    @Given("That the client is located on the Plazavea website")
    public void thatTheClientIsLocatedOnThePlazaveaWebsite() {
        theActorInTheSpotlight().wasAbleTo(OpenPage.PlazaVeaPage());
    }

    @When("Add a product to the shopping cart")
    public void addAProductToTheShoppingCart() {
    }

    @Then("Verify that the product was added")
    public void verifyThatTheProductWasAdded() {

    }

}
