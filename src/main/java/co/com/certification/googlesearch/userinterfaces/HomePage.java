package co.com.certification.googlesearch.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    public  static final Target TITLE_PRODUCTS_LABEL=
            Target.the("Title products home page").located(By.xpath("//span[text()='Products']"));
}
