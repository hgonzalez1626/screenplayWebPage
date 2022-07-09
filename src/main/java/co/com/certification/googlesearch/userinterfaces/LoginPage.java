package co.com.certification.googlesearch.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    public static final Target USERNAME_INPUT = Target.the("Username field input").located(By.id("user-name"));
    public static final Target PASSWORD_INPUT = Target.the("Password field input").located(By.id("password"));
    public static final Target LOGIN_BUTTON = Target.the("Button Authentication").located(By.id("login-button"));
}
