package com.sophos.test.tasks.plazavea;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sophos.test.userinterfaces.plazavea.HomePage.*;
import static com.sophos.test.userinterfaces.plazavea.ProductList.BTN_ADD_PRODUCT;
import static com.sophos.test.userinterfaces.plazavea.ProductList.LNK_ENTER_THE_PRODUCT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProduct implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(BTN_NO_POPOVER),
            Click.on(BTN_CLOSE_POPUP),
            Click.on(LIST_NAVBAR_ELECTROYHOGAR),
            Click.on(SELECT_TVLED_CATEGORY),
            Click.on(LNK_ENTER_THE_PRODUCT),
            Click.on(BTN_ADD_PRODUCT)
        );
    }

    public static AddProduct toShoppingCart(){
        return instrumented(AddProduct.class);
    }
}
