package com.sophos.test.tasks.plazavea;

import com.sophos.test.userinterfaces.plazavea.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenPage implements Task {
    private HomePage homepage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(homepage));
    }

    public static OpenPage PlazaVeaPage() {
        return instrumented(OpenPage.class);
    }
}
