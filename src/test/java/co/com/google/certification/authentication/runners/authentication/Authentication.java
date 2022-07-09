package co.com.google.certification.authentication.runners.authentication;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/trn_authentication.feature"},
        glue = {"co.com.google.certification.authentication.stepdefinitions"},
        plugin = {"json:target/cucumber_json/cucumber.json"},
        snippets = SnippetType.CAMELCASE
)

public class Authentication {
}



