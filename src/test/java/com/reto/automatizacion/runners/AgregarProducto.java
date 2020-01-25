package com.reto.automatizacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/com/reto/automatizacion/plazavea/comprar_producto.feature",
        tags = {"@AddToCart"},
        glue = "stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class AgregarProducto {
}
