package co.com.certification.googlesearch.interations.commons;

import co.com.certification.googlesearch.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenTheBrowser implements Interaction {

    private LoginPage loginPage;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(loginPage));
    }

    public static OpenTheBrowser navigateForGoogle(){

        return instrumented(OpenTheBrowser.class);
    }
}
