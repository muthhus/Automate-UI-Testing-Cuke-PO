package org.jlrdigital.bdd.afrl.ui.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage extends BasePage{

	By topResultLink = By.xpath("//div[@class='section standard-content']//ul/li//div[@class='content']//h4/a");
  public SearchResultPage(WebDriver driver) {
      super(driver);
//      valCorrectPage("Stockhol");
      valCorrectPage("SEARCH RESULTS");
      }

  public CarDetailPage clickOnTopSearchResultLink() {
      click(topResultLink);
      return new CarDetailPage(driver);
  }
}
