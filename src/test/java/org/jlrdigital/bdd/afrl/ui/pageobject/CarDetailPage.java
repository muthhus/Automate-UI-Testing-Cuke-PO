package org.jlrdigital.bdd.afrl.ui.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CarDetailPage extends BasePage{

    By resultPageHeadLine = By.cssSelector("h1");

    public CarDetailPage(WebDriver driver) {
        super(driver);
        valCorrectPage("Compact Performance SUV | New E‑PACE | Jaguar UK");
    }

    public String getHeadLine() {
    	return getText(resultPageHeadLine);
    }

}

