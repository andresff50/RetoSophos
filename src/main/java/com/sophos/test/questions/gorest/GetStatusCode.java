package com.sophos.test.questions.gorest;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

/**
 * This class return the last response of the status code of the request.
 * @author Andres Villalba
 */
public class GetStatusCode implements Question {

    public static Question<Integer> was() {
        return new GetStatusCode();
    }

    @Override
    public Integer answeredBy(Actor actor) {
        return SerenityRest.lastResponse().statusCode();
    }
}
