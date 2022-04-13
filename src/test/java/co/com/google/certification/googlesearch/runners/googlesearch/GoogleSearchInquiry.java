package co.com.google.certification.googlesearch.runners.googlesearch;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/trn_googlesearch.feature"},
        glue = {"co.com.google.certification.googlesearch.stepdefinitions"},
        plugin = {"json:target/cucumber_json/cucumber.json"},
        snippets = SnippetType.CAMELCASE
)

public class GoogleSearchInquiry {
}
