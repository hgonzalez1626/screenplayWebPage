package co.com.certification.googlesearch.tasks;

import co.com.certification.googlesearch.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo implements Task {

    private LoginPage loginPage;

    public static NavigateTo visitSauceLabPageWeb(){
        return Tasks.instrumented(NavigateTo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(loginPage));
    }
}
