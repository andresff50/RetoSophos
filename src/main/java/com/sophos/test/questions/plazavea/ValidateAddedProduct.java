package com.sophos.test.questions.plazavea;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateAddedProduct implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean validation = false;
        if (actor.recall("dataSkuProduct").equals(actor.recall("dataSkuShoppingCart"))) {
            validation = true;
        }
        return validation;

    }

    public static ValidateAddedProduct toCart() {
        return new ValidateAddedProduct();
    }
}
