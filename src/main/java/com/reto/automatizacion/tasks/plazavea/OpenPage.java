package com.reto.automatizacion.tasks.plazavea;

import com.reto.automatizacion.userinterfaces.plazavea.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static com.reto.automatizacion.userinterfaces.plazavea.HomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenPage implements Task {
    private HomePage homepage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(homepage),
                Click.on(POPOVER_BUTTON_NO),
                Click.on(POPUP_LEYSECA_BUTTONCLOSE),
                Click.on(NAVBAR_ELECTROYHOGAR),
                Click.on(MENU_TVLEDCATEGORY)
        );
    }

    public static OpenPage PlazaVeaPage() {
        return instrumented(OpenPage.class);
    }
}
