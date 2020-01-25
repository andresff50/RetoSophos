package com.sophos.test.tasks.plazavea;

import com.sophos.test.interactions.plazavea.GoToProductDetail;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sophos.test.userinterfaces.plazavea.ProductList.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProduct implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(GoToProductDetail.onScreen());
        actor.remember("dataSkuProduct", INFO_PRODUCT_DATASKU.resolveFor(actor).getAttribute("value"));
        actor.attemptsTo(
                Click.on(BTN_ADD_PRODUCT),
                Click.on(BTN_SHOPPING_CART)
        );
        actor.remember("dataSkuShoppingCart", INFO_PRODUCT_SHOPPING_CART.resolveFor(actor).getAttribute("data-sku"));
    }

    public static AddProduct toShoppingCart() {
        return instrumented(AddProduct.class);
    }
}
