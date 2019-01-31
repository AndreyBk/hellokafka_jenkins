package ru.mail.propre.steps;

import net.thucydides.core.annotations.Step;
import ru.mail.propre.ui.DecohereHomePage;
import ru.mail.propre.ui.LandingPage;

import static org.assertj.core.api.Assertions.assertThat;


public class DecohereUser {
    private DecohereHomePage decohereHomePage;
    private LandingPage landingPage;

    @Step ("*** Step 1 *** ")
    public void isOnTheHomePage() {

        decohereHomePage.open();
    }

    @Step
    public void logsInAsAdmin() {

        decohereHomePage.loginAsAdmin();
    }

    @Step
    public void shouldBeOnLandingPage() {

        assertThat(landingPage.noticeMessage()).isEqualTo("You are now logged in as admin@decohere.com.");
    }
}
