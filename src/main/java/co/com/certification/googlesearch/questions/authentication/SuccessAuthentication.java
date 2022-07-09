package co.com.certification.googlesearch.questions.authentication;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.certification.googlesearch.userinterfaces.HomePage.TITLE_PRODUCTS_LABEL;

public class SuccessAuthentication implements Question<Boolean> {

    public static SuccessAuthentication theVerificationWasSuccessForAuthentication(){
        return new SuccessAuthentication();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return TITLE_PRODUCTS_LABEL.resolveFor(actor).getText().equalsIgnoreCase("PRODUCTS");
    }
}
