package co.com.certification.googlesearch.interations.authentication;

import co.com.certification.googlesearch.models.Credentials;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.certification.googlesearch.userinterfaces.LoginPage.*;

public class Authenticate implements Interaction {

    private Credentials credentials;

    public Authenticate(Credentials credentials) {
        this.credentials = credentials;
    }

    public static Authenticate authenticateWithTheNext(Credentials credentials){
        return Tasks.instrumented(Authenticate.class, credentials);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(credentials.getUser()).into(USERNAME_INPUT),
                Enter.theValue(credentials.getPassword()).into(PASSWORD_INPUT),
                Click.on(LOGIN_BUTTON));
    }
}
