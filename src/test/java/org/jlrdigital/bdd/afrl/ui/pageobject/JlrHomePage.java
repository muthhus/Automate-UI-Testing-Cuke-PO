package org.jlrdigital.bdd.afrl.ui.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class JlrHomePage extends BasePage {

    By searchField = By.id("input-query");

    public JlrHomePage(WebDriver driver) {
        super(driver);
        visit(baseUrl + "/");
    }

    public SearchResultPage searchFor(String location) {
        try {
            clear(searchField);
            type(location, searchField);
            submit(searchField);
        }
        catch (RuntimeException e) {
            takeScreenshot(e, "searchError");
        }
        return new SearchResultPage(driver);
    }



}

