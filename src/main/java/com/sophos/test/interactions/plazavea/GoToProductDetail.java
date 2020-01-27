package com.sophos.test.interactions.plazavea;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sophos.test.userinterfaces.plazavea.HomePage.*;
import static com.sophos.test.userinterfaces.plazavea.ProductList.LNK_ENTER_THE_PRODUCT;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class GoToProductDetail implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_NO_POPOVER, isVisible()),
                Click.on(BTN_NO_POPOVER),
                Click.on(BTN_CLOSE_POPUP),
                Click.on(LIST_NAVBAR_ELECTROYHOGAR),
                Click.on(SELECT_TVLED_CATEGORY),
                Click.on(LNK_ENTER_THE_PRODUCT)
        );
    }

    public static GoToProductDetail onScreen() {
        return instrumented(GoToProductDetail.class);
    }
}
