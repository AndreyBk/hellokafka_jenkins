package ru.mail.propre.features.authentication;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import ru.mail.propre.steps.DecohereUser;

@RunWith(SerenityRunner.class)
public class WhenAuthenticating {

    @Steps
    private DecohereUser _user;

//    @Managed(driver = "chrome")
    @Managed
    WebDriver _browser;

    @Test
    public void shouldBeAbleToLoginAsAdmin() {
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//        System.setProperty("webdriver.chrome.driver", "C:\\BK\\JavaProjects\\chromedriver_win32\\chromedriver.exe");
//        System.setProperty("webdriver.gecko.driver", "C:\\BK\\JavaProjects\\geckodriver\\geckodriver.exe");
//

//        ProfilesIni profile = new ProfilesIni();
//
//        FirefoxProfile myprofile = profile.getProfile("profileToolsQA");
//
//        WebDriver driver = new FirefoxDriver(myprofile);




        _user.isOnTheHomePage();

        _user.logsInAsAdmin();

        _user.shouldBeOnLandingPage();
    }
}
