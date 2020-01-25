package com.reto.automatizacion.tasks.plazavea;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenPage implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

    }

    public static OpenPage PlazaVeaPage(){
        return instrumented(OpenPage.class);
    }
}
