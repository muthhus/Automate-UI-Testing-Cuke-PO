package org.jlrdigital.bdd.afrl.ui.pageobject;

public interface Config {
	
	String baseUrl        = System.getProperty("baseUrl", "https://www.jaguar.co.uk"); 
    String browser        = System.getProperty("browser", "firefox");

    //to support executing using SauceLabs
    String host           = System.getProperty("host", "localhost"); 
    String browserVersion = System.getProperty("browserVersion", "35");
    String platform       = System.getProperty("platform", "Windows 8.1");


}
