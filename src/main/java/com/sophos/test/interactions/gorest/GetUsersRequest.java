package com.sophos.test.interactions.gorest;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * This is a class to get Users information in a json format
 * @author Andres Villalba
 */
public class GetUsersRequest implements Interaction {
    private final String token;

    public GetUsersRequest(String token) {
        this.token = token;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource("/users?_format=json&access-token=" + token)
                        .with(requestSpecification -> requestSpecification.contentType(ContentType.JSON)
                                .header("Header 1", "Value 1")
                )
        );
    }

    public static Performable fromPage(String token) {
        return instrumented(GetUsersRequest.class, token);
    }
}
