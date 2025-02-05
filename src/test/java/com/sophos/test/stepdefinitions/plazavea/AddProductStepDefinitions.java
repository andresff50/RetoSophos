package com.sophos.test.stepdefinitions.plazavea;

import com.sophos.test.questions.plazavea.ValidateAddedProduct;
import com.sophos.test.tasks.plazavea.AddProduct;
import com.sophos.test.tasks.plazavea.OpenPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

/**
 * This class contains the steps for the certification of the case to add a product to the cart.
 * @author Andres Villalba
 */
public class AddProductStepDefinitions {

    @Before
    public void InitialConfiguration() {
        setTheStage(new OnlineCast());
        OnStage.theActorCalled("The client");
    }

    @Given("That the client is located on the Plazavea website")
    public void thatTheClientIsLocatedOnThePlazaveaWebsite() {
        theActorInTheSpotlight().wasAbleTo(OpenPage.PlazaVeaPage());
    }

    @When("Add a product to the shopping cart")
    public void addAProductToTheShoppingCart() {
        theActorInTheSpotlight().wasAbleTo(AddProduct.toShoppingCart());
    }

    @Then("Verify that the product was added")
    public void verifyThatTheProductWasAdded() {
        theActorInTheSpotlight().should(seeThat(ValidateAddedProduct.toCart()));
    }

}
