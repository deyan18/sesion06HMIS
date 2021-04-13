package org.ual.selenium.hmis;

// Generated by Selenium IDE
import org.junit.Test;

import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class MiembrosTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
	// Browser selector 
	int browser= 0; // 0: firefox, 1: chrome,...
	Boolean headless = true;

	switch (browser) {
	case 0:  // firefox
		// Firefox 
		// Descargar geckodriver de https://github.com/mozilla/geckodriver/releases
		// Descomprimir el archivo geckodriver.exe en la carpeta drivers

		System.setProperty("webdriver.gecko.driver",  "drivers/geckodriver.exe");
		FirefoxOptions firefoxOptions = new FirefoxOptions();
		if (headless) firefoxOptions.setHeadless(headless);
		driver = new FirefoxDriver(firefoxOptions);

		break;
	case 1: // chrome
		// Chrome
		// Descargar Chromedriver de https://chromedriver.chromium.org/downloads
		// Descomprimir el archivo chromedriver.exe en la carpeta drivers

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		if (headless) chromeOptions.setHeadless(headless);
		chromeOptions.addArguments("window-size=1920,1080");
		driver = new ChromeDriver(chromeOptions);

		break;

	default:
		fail("Please select a browser");
		break;
	}
	js = (JavascriptExecutor) driver;
	vars = new HashMap<String, Object>();

  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void deyan() {
    // Test name: deyan
    // Step # | name | target | value
    // 1 | open | https://hmis21-drs600.azurewebsites.net/ | 
    driver.get("https://hmis21-drs600.azurewebsites.net/");
    // 2 | setWindowSize | 1253x812 | 
    driver.manage().window().setSize(new Dimension(1253, 812));
    // 3 | click | css=.col-md-6:nth-child(2) path | 
    driver.findElement(By.cssSelector(".col-md-6:nth-child(2) path")).click();
    // 4 | assertText | css=.masthead-heading | DEYAN
    assertThat(driver.findElement(By.cssSelector(".masthead-heading")).getText(), is("DEYAN"));
    // 5 | assertText | css=.container > .mb-0:nth-child(1) | SOBRE MI
    assertThat(driver.findElement(By.cssSelector(".container > .mb-0:nth-child(1)")).getText(), is("SOBRE MI"));
    // 6 | assertText | css=.mx-auto > .page-section-heading | ENLACES
    assertThat(driver.findElement(By.cssSelector(".mx-auto > .page-section-heading")).getText(), is("ENLACES"));
    // 7 | assertText | linkText=Mi GitHub | Mi GitHub
    assertThat(driver.findElement(By.linkText("Mi GitHub")).getText(), is("Mi GitHub"));
    // 8 | assertText | linkText=Mi LinkedIn | Mi LinkedIn
    assertThat(driver.findElement(By.linkText("Mi LinkedIn")).getText(), is("Mi LinkedIn"));
    // 9 | click | css=.navbar-brand | 
    driver.findElement(By.cssSelector(".navbar-brand")).click();
  }
  @Test
  public void maria() {
    // Test name: maria
    // Step # | name | target | value
    // 1 | open | https://hmis21-drs600.azurewebsites.net/ | 
    driver.get("https://hmis21-drs600.azurewebsites.net/");
    // 2 | setWindowSize | 1250x809 | 
    driver.manage().window().setSize(new Dimension(1250, 809));
    // 3 | click | css=.col-md-6:nth-child(1) path | 
    driver.findElement(By.cssSelector(".col-md-6:nth-child(1) path")).click();
    // 4 | assertText | css=.masthead-heading | MARÃ�A
    assertThat(driver.findElement(By.cssSelector(".masthead-heading")).getText(), is("MARÍA"));
    // 5 | assertText | css=#contact .page-section-heading | BIOGRAFÃ�A
    assertThat(driver.findElement(By.cssSelector("#contact .page-section-heading")).getText(), is("BIOGRAFÍA"));
    // 6 | assertText | css=.container > .text-white:nth-child(1) | AFICIONES
    assertThat(driver.findElement(By.cssSelector(".container > .text-white:nth-child(1)")).getText(), is("AFICIONES"));
    // 7 | assertText | linkText=Mi GitHub | Mi GitHub
    assertThat(driver.findElement(By.linkText("Mi GitHub")).getText(), is("Mi GitHub"));
    // 8 | click | css=.navbar-brand | 
    driver.findElement(By.cssSelector(".navbar-brand")).click();
  }
  @Test
  public void sokaina() {
    // Test name: sokaina
    // Step # | name | target | value
    // 1 | open | https://hmis21-drs600.azurewebsites.net/ | 
    driver.get("https://hmis21-drs600.azurewebsites.net/");
    // 2 | setWindowSize | 1256x815 | 
    driver.manage().window().setSize(new Dimension(1256, 815));
    // 3 | click | css=.col-md-6:nth-child(3) path | 
    driver.findElement(By.cssSelector(".col-md-6:nth-child(3) path")).click();
    // 4 | assertText | css=.masthead-heading | SOKAINART
    assertThat(driver.findElement(By.cssSelector(".masthead-heading")).getText(), is("SOKAINART"));
    // 5 | assertText | css=#contact .page-section-heading | SOBRE MI
    assertThat(driver.findElement(By.cssSelector("#contact .page-section-heading")).getText(), is("SOBRE MI"));
    // 6 | assertText | css=#portfolio .divider-custom-icon | Mis aficiones
    assertThat(driver.findElement(By.cssSelector("#portfolio .divider-custom-icon")).getText(), is("Mis aficiones"));
    // 7 | assertText | css=.mx-auto > .page-section-heading | ENLACES
    assertThat(driver.findElement(By.cssSelector(".mx-auto > .page-section-heading")).getText(), is("ENLACES"));
    // 8 | assertText | linkText=Mi GitHub | Mi GitHub
    assertThat(driver.findElement(By.linkText("Mi GitHub")).getText(), is("Mi GitHub"));
    // 9 | click | css=.navbar-brand | 
    driver.findElement(By.cssSelector(".navbar-brand")).click();
  }
}
