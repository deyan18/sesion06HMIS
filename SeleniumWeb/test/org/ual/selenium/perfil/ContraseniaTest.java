package org.ual.selenium.perfil;

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
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
import java.net.URL;
public class ContraseniaTest {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;
	@Before
	public void setUp() {
		/*
		FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.setHeadless(true);
		driver = new FirefoxDriver(firefoxOptions);
			*/	
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setHeadless(true);
		driver = new ChromeDriver(chromeOptions);
		
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}
	@After
	public void tearDown() {
		driver.quit();
	}
	@Test
	public void contraseniadistinta() {
		// Test name: Contrasenia_distinta
		// Step # | name | target | value
		// 1 | open | http://hmis21-weblogin2.azurewebsites.net/login | 
		driver.get("http://hmis21-weblogin2.azurewebsites.net/login");
		// 2 | setWindowSize | 1246x824 | 
		driver.manage().window().setSize(new Dimension(1246, 824));
		// 3 | click | linkText=Sign up | 
		driver.findElement(By.linkText("Sign up")).click();
		// 4 | executeScript | return "ual-" + Math.floor(Math.random()*1500000) + "@ual.es" | emailrandom
		vars.put("emailrandom", js.executeScript("return \"ual-\" + Math.floor(Math.random()*1500000) + \"@ual.es\""));
		// 5 | echo | ${emailrandom} | 
		System.out.println(vars.get("emailrandom").toString());
		// 6 | type | id=full-name | Nombre
		driver.findElement(By.id("full-name")).sendKeys("Nombre");
		// 7 | click | id=email-address | 
		driver.findElement(By.id("email-address")).click();
		// 8 | type | id=email-address | ${emailrandom}
		driver.findElement(By.id("email-address")).sendKeys(vars.get("emailrandom").toString());
		// 9 | click | id=password | 
		driver.findElement(By.id("password")).click();
		// 10 | type | id=password | 123456
		driver.findElement(By.id("password")).sendKeys("123456");
		// 11 | click | id=confirm-password | 
		driver.findElement(By.id("confirm-password")).click();
		// 12 | type | id=confirm-password | 123456
		driver.findElement(By.id("confirm-password")).sendKeys("123456");
		// 13 | click | id=terms-agreement | 
		driver.findElement(By.id("terms-agreement")).click();
		// 14 | click | css=.button-text | 
		driver.findElement(By.cssSelector(".button-text")).click();
		// 15 | click | id=header-account-menu-link | 
		{
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(By.id("header-account-menu-link")));
		}
		driver.findElement(By.id("header-account-menu-link")).click();
		// 16 | click | linkText=Settings | 
		driver.findElement(By.linkText("Settings")).click();
		// 17 | click | linkText=Change password | 
		driver.findElement(By.linkText("Change password")).click();
		// 18 | type | id=password | 123
		driver.findElement(By.id("password")).sendKeys("123");
		// 19 | click | id=confirm-password | 
		driver.findElement(By.id("confirm-password")).click();
		// 20 | type | id=confirm-password | 1234
		driver.findElement(By.id("confirm-password")).sendKeys("1234");
		// 21 | click | css=.button-text | 
		driver.findElement(By.cssSelector(".button-text")).click();
		// 22 | assertText | css=.invalid-feedback | Your new password and confirmation do not match.
		assertThat(driver.findElement(By.cssSelector(".invalid-feedback")).getText(), is("Your new password and confirmation do not match."));
		// 23 | click | id=header-account-menu-link | 
		driver.findElement(By.id("header-account-menu-link")).click();
		// 24 | click | linkText=Sign out | 
		driver.findElement(By.linkText("Sign out")).click();
	}
	@Test
	public void contraseniauncampo() {
		// Test name: Contrasenia_un_campo
		// Step # | name | target | value
		// 1 | open | http://hmis21-weblogin2.azurewebsites.net/login | 
		driver.get("http://hmis21-weblogin2.azurewebsites.net/login");
		// 2 | setWindowSize | 1246x824 | 
		driver.manage().window().setSize(new Dimension(1246, 824));
		// 3 | click | linkText=Sign up | 
		driver.findElement(By.linkText("Sign up")).click();
		// 4 | executeScript | return "ual-" + Math.floor(Math.random()*1500000) + "@ual.es" | emailrandom
		vars.put("emailrandom", js.executeScript("return \"ual-\" + Math.floor(Math.random()*1500000) + \"@ual.es\""));
		// 5 | echo | ${emailrandom} | 
		System.out.println(vars.get("emailrandom").toString());
		// 6 | type | id=full-name | Nombre
		driver.findElement(By.id("full-name")).sendKeys("Nombre");
		// 7 | click | id=email-address | 
		driver.findElement(By.id("email-address")).click();
		// 8 | type | id=email-address | ${emailrandom}
		driver.findElement(By.id("email-address")).sendKeys(vars.get("emailrandom").toString());
		// 9 | click | id=password | 
		driver.findElement(By.id("password")).click();
		// 10 | type | id=password | 123456
		driver.findElement(By.id("password")).sendKeys("123456");
		// 11 | click | id=confirm-password | 
		driver.findElement(By.id("confirm-password")).click();
		// 12 | type | id=confirm-password | 123456
		driver.findElement(By.id("confirm-password")).sendKeys("123456");
		// 13 | click | id=terms-agreement | 
		driver.findElement(By.id("terms-agreement")).click();
		// 14 | click | css=.button-text | 
		driver.findElement(By.cssSelector(".button-text")).click();
		// 15 | click | id=header-account-menu-link | 
		{
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(By.id("header-account-menu-link")));
		}
		driver.findElement(By.id("header-account-menu-link")).click();
		// 16 | click | linkText=Settings | 
		driver.findElement(By.linkText("Settings")).click();
		// 17 | click | linkText=Change password | 
		driver.findElement(By.linkText("Change password")).click();
		// 18 | type | id=password | 123
		driver.findElement(By.id("password")).sendKeys("123");
		// 19 | click | css=.button-text | 
		driver.findElement(By.cssSelector(".button-text")).click();
		// 20 | assertText | css=.invalid-feedback | Your new password and confirmation do not match.
		assertThat(driver.findElement(By.cssSelector(".invalid-feedback")).getText(), is("Your new password and confirmation do not match."));
		// 21 | click | id=header-account-menu-link | 
		driver.findElement(By.id("header-account-menu-link")).click();
		// 22 | click | linkText=Sign out | 
		driver.findElement(By.linkText("Sign out")).click();
	}
	@Test
	public void contraseniavacia() {
		// Test name: Contrasenia_vacia
		// Step # | name | target | value
		// 1 | open | http://hmis21-weblogin2.azurewebsites.net/login | 
		driver.get("http://hmis21-weblogin2.azurewebsites.net/login");
		// 2 | setWindowSize | 1246x824 | 
		driver.manage().window().setSize(new Dimension(1246, 824));
		// 3 | click | linkText=Sign up | 
		driver.findElement(By.linkText("Sign up")).click();
		// 4 | executeScript | return "ual-" + Math.floor(Math.random()*1500000) + "@ual.es" | emailrandom
		vars.put("emailrandom", js.executeScript("return \"ual-\" + Math.floor(Math.random()*1500000) + \"@ual.es\""));
		// 5 | echo | ${emailrandom} | 
		System.out.println(vars.get("emailrandom").toString());
		// 6 | type | id=full-name | Nombre
		driver.findElement(By.id("full-name")).sendKeys("Nombre");
		// 7 | click | id=email-address | 
		driver.findElement(By.id("email-address")).click();
		// 8 | type | id=email-address | ${emailrandom}
		driver.findElement(By.id("email-address")).sendKeys(vars.get("emailrandom").toString());
		// 9 | click | id=password | 
		driver.findElement(By.id("password")).click();
		// 10 | type | id=password | 123456
		driver.findElement(By.id("password")).sendKeys("123456");
		// 11 | click | id=confirm-password | 
		driver.findElement(By.id("confirm-password")).click();
		// 12 | type | id=confirm-password | 123456
		driver.findElement(By.id("confirm-password")).sendKeys("123456");
		// 13 | click | id=terms-agreement | 
		driver.findElement(By.id("terms-agreement")).click();
		// 14 | click | css=.button-text | 
		driver.findElement(By.cssSelector(".button-text")).click();
		// 15 | click | id=header-account-menu-link | 
		{
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(By.id("header-account-menu-link")));
		}
		driver.findElement(By.id("header-account-menu-link")).click();
		// 16 | click | linkText=Settings | 
		driver.findElement(By.linkText("Settings")).click();
		// 17 | click | linkText=Change password | 
		driver.findElement(By.linkText("Change password")).click();
		// 18 | click | css=.button-text | 
		driver.findElement(By.cssSelector(".button-text")).click();
		// 19 | assertText | css=.col-sm-6:nth-child(1) .invalid-feedback | Please enter a password or choose "Cancel".
		assertThat(driver.findElement(By.cssSelector(".col-sm-6:nth-child(1) .invalid-feedback")).getText(), is("Please enter a password or choose \"Cancel\"."));
		// 20 | assertText | css=.col-sm-6:nth-child(2) .invalid-feedback | Your new password and confirmation do not match.
		assertThat(driver.findElement(By.cssSelector(".col-sm-6:nth-child(2) .invalid-feedback")).getText(), is("Your new password and confirmation do not match."));
		// 21 | click | id=header-account-menu-link | 
		driver.findElement(By.id("header-account-menu-link")).click();
		// 22 | click | linkText=Sign out | 
		driver.findElement(By.linkText("Sign out")).click();
	}
}
