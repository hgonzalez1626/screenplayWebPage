package co.com.google.certification.authentication.stepdefinitions;

import co.com.certification.googlesearch.exceptions.AuthenticationException;
import co.com.certification.googlesearch.models.Credentials;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static co.com.certification.googlesearch.exceptions.AuthenticationException.THE_AUTHENTICATION_WAS_FAILED;
import static co.com.certification.googlesearch.questions.authentication.SuccessAuthentication.theVerificationWasSuccessForAuthentication;
import static co.com.certification.googlesearch.tasks.Authenticate.authenticateWith;
import static co.com.certification.googlesearch.tasks.NavigateTo.visitSauceLabPageWeb;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;


public class AuthenticationStepDefinitions {

    @Before
    public void initialConfiguration(){
        setTheStage(new OnlineCast());
    }
    @Given("^(.*) visit the SauceLab Web$")
    public void userVisitTheSauceLabWeb(String actor) {
        theActorCalled(actor).wasAbleTo(visitSauceLabPageWeb());

    }

    @When("^User trie to login with the next information$")
    public void userTrieToLoginWithTheNextInformation(List<Credentials> data) {
        theActorInTheSpotlight().attemptsTo(authenticateWith(data.get(0)));

    }

    @Then("^User verifies is success authentication was successful$")
    public void userVerifiesIsSuccessAuthenticationWasSuccessful() throws Exception {
        theActorInTheSpotlight().should(seeThat(theVerificationWasSuccessForAuthentication()).orComplainWith(AuthenticationException.class,THE_AUTHENTICATION_WAS_FAILED));
        // Write code here that turns the phrase above into concrete actions

    }
}
