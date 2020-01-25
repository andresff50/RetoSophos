package com.reto.automatizacion.runners.plazavea;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/com/reto/automatizacion/plazavea/buy_product.feature",
        tags = {"@AddToCart"},
        glue = "com.reto.automatizacion.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class AddProduct {
}
