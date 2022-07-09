package co.com.certification.googlesearch.tasks;

import co.com.certification.googlesearch.models.Credentials;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.certification.googlesearch.interations.authentication.Authenticate.*;

public class Authenticate implements Task {

    private Credentials credentials;

    public Authenticate(Credentials credentials) {
        this.credentials = credentials;
    }

    public static Authenticate authenticateWith(Credentials credentials){
        return Tasks.instrumented(Authenticate.class, credentials);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(authenticateWithTheNext(credentials));
    }

}
