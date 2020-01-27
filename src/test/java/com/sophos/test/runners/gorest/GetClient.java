package com.sophos.test.runners.gorest;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/com/sophos/test/gorest/validate_rest_services.feature",
        tags = {"@GetClient"},
        glue = "com.sophos.test.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
/**
 * @author Andres Villalba
 */
public class GetClient {
}
