package com.sophos.test.tasks.gorest;

import com.sophos.test.interactions.gorest.GetUsersRequest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.abiities.CallAnApi;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class MakeRequest implements Task {
    private final String restApiUrl = "https://gorest.co.in/public-api";
    private String token;

    public MakeRequest(String token) {
        this.token = token;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.whoCan(CallAnApi.at(restApiUrl));
        actor.attemptsTo(GetUsersRequest.fromPage(token));
    }

    public static MakeRequest toServices(String token) {
        return instrumented(MakeRequest.class, token);
    }
}
