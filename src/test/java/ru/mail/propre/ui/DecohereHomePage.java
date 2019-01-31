package ru.mail.propre.ui;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://decohere.herokuapp.com/")
public class DecohereHomePage extends PageObject {

    public void loginAsAdmin(){
        $("#openLogin").click();

        $("#username").sendKeys("admin@decohere.com");
        $("#password").sendKeys("admin");

        $("#login").click();
    }




}
