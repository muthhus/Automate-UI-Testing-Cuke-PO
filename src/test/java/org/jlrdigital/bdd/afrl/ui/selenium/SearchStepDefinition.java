package org.jlrdigital.bdd.afrl.ui.selenium;

import static junit.framework.Assert.assertTrue;

import org.jlrdigital.bdd.afrl.ui.pageobject.CarDetailPage;
import org.jlrdigital.bdd.afrl.ui.pageobject.Config;
import org.jlrdigital.bdd.afrl.ui.pageobject.JlrHomePage;
import org.jlrdigital.bdd.afrl.ui.pageobject.SearchResultPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SearchStepDefinition implements Config {
    private WebDriver driver;
    private JlrHomePage home;
    private SearchResultPage searchResult;

    @Before
    public void setUp() {
        if (browser.equals("firefox")) {
            driver = new FirefoxDriver();
        } else {
            if (browser.equals("chrome")) {
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/vendor/chromedriver.exe");
                driver = new ChromeDriver();
            }
        }
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Given("^I want to find out the details of New E-PACE Cars Details$")
    public void prepareHomePage(){
        home = new JlrHomePage(driver);
    }

    @When("^I search for (.*)$")
    public void search(String location) {
        searchResult = home.searchFor(location);
    }

    @Then("^I should be able to get the information about the JLR New (.*)$")
    public void assertTheSearchResult(String locationName) {
        CarDetailPage carDetailPage = searchResult.clickOnTopSearchResultLink();
        String actualHeadline = carDetailPage.getHeadLine();
        assertTrue(actualHeadline.contains("NEW E‑PACE"));
    }

}

