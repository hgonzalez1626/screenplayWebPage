package co.com.google.certification.googlesearch.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.certification.googlesearch.interations.commons.OpenTheBrowser.navigateForGoogle;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;


public class GoogleSearchInquiryStepDefinitions {

    @Before
    public void initialConfiguration(){
        setTheStage(new OnlineCast());
    }
    @Given("^(.*) visit the google web search$")
    public void userVisitTheGoogleWebSearch(String actor) throws Exception {
        theActorCalled(actor).wasAbleTo(navigateForGoogle());
    }

    @When("^User trie to search the next information$")
    public void userTrieToSearchTheNextInformation(String arg1) throws Exception {

    }

    @Then("^User verifies is success for the search$")
    public void userVerifiesIsSuccessForTheSearch() throws Exception {

    }
}
