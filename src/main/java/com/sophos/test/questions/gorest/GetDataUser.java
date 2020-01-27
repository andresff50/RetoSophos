package com.sophos.test.questions.gorest;

import com.sophos.test.models.gorest.ResultData;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

/**
 * This class returns the last response contained in the ResultData class.
 * @author Andres Villalba
 */
public class GetDataUser implements Question<ResultData> {
    @Override
    public ResultData answeredBy(Actor actor) {
        return SerenityRest.lastResponse().as(ResultData.class);
    }
}
