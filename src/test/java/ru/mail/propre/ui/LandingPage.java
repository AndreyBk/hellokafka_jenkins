package ru.mail.propre.ui;

import net.thucydides.core.pages.PageObject;

public class LandingPage extends PageObject {
    public String noticeMessage(){
        return $(".notice").getText();
    }
}
