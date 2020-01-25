package com.sophos.test.runners.plazavea;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/com/sophos/test/plazavea/buy_product.feature",
        tags = {"@AddToCart"},
        glue = "com.sophos.test.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class AddProduct {
}
