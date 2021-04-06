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
import java.net.MalformedURLException;
import java.net.URL;
public class CambiocontraseniaTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
	// Browser selector 
			int browser= 1; // 0: firefox, 1: chrome,...
			Boolean headless = false;

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
  public void perfilcontraseniacorrecta() {
    // Test name: Perfil_contrasenia_correcta
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://localhost:8080/");
    // 2 | setWindowSize | 1536x824 | 
    driver.manage().window().setSize(new Dimension(1536, 824));
    // 3 | click | linkText=Registrarse | 
    driver.findElement(By.linkText("Registrarse")).click();
    // 4 | executeScript | return "ual-" + Math.floor(Math.random()*1500000) + "@ual.es" | emailrandom
    vars.put("emailrandom", js.executeScript("return \"ual-\" + Math.floor(Math.random()*1500000) + \"@ual.es\""));
    // 5 | echo | ${emailrandom} | 
    System.out.println(vars.get("emailrandom").toString());
    // 6 | click | id=email | 
    driver.findElement(By.id("email")).click();
    // 7 | type | id=email | ${emailrandom}
    driver.findElement(By.id("email")).sendKeys(vars.get("emailrandom").toString());
    // 8 | click | id=contrasenia | 
    driver.findElement(By.id("contrasenia")).click();
    // 9 | type | id=contrasenia | 123456
    driver.findElement(By.id("contrasenia")).sendKeys("123456");
    // 10 | click | id=confirmar | 
    driver.findElement(By.id("confirmar")).click();
    // 11 | type | id=confirmar | 123456
    driver.findElement(By.id("confirmar")).sendKeys("123456");
    // 12 | click | id=firstName | 
    driver.findElement(By.id("firstName")).click();
    // 13 | type | id=firstName | nombre
    driver.findElement(By.id("firstName")).sendKeys("nombre");
    // 14 | click | id=lastName | 
    driver.findElement(By.id("lastName")).click();
    // 15 | type | id=lastName | apellido
    driver.findElement(By.id("lastName")).sendKeys("apellido");
    // 16 | click | css=.btn | 
    driver.findElement(By.cssSelector(".btn")).click();
    // 17 | click | linkText=Pinche aqui para iniciar sesion | 
    driver.findElement(By.linkText("Pinche aqui para iniciar sesion")).click();
    // 18 | click | id=username | 
    driver.findElement(By.id("username")).click();
    // 19 | type | id=username | ${emailrandom}
    driver.findElement(By.id("username")).sendKeys(vars.get("emailrandom").toString());
    // 20 | click | id=password | 
    driver.findElement(By.id("password")).click();
    // 21 | type | id=password | 123456
    driver.findElement(By.id("password")).sendKeys("123456");
    // 22 | click | css=.btn | 
    driver.findElement(By.cssSelector(".btn")).click();
    // 23 | click | linkText=Editar | 
    driver.findElement(By.linkText("Editar")).click();
    // 24 | click | id=contr | 
    driver.findElement(By.id("contr")).click();
    // 25 | type | id=contr | 654321
    driver.findElement(By.id("contr")).sendKeys("654321");
    // 26 | click | id=confirmar | 
    driver.findElement(By.id("confirmar")).click();
    // 27 | type | id=confirmar | 654321
    driver.findElement(By.id("confirmar")).sendKeys("654321");
    // 28 | click | css=.btn | 
    driver.findElement(By.cssSelector(".btn")).click();
    // 29 | assertText | css=h3 | El usuario se ha modificado correctamente!
    assertThat(driver.findElement(By.cssSelector("h3")).getText(), is("El usuario se ha modificado correctamente!"));
  }
  @Test
  public void perfilcontraseniacorta() {
    // Test name: Perfil_contrasenia_corta
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://localhost:8080/");
    // 2 | setWindowSize | 1536x824 | 
    driver.manage().window().setSize(new Dimension(1536, 824));
    // 3 | click | linkText=Registrarse | 
    driver.findElement(By.linkText("Registrarse")).click();
    // 4 | executeScript | return "ual-" + Math.floor(Math.random()*1500000) + "@ual.es" | emailrandom
    vars.put("emailrandom", js.executeScript("return \"ual-\" + Math.floor(Math.random()*1500000) + \"@ual.es\""));
    // 5 | echo | ${emailrandom} | 
    System.out.println(vars.get("emailrandom").toString());
    // 6 | click | id=email | 
    driver.findElement(By.id("email")).click();
    // 7 | type | id=email | ${emailrandom}
    driver.findElement(By.id("email")).sendKeys(vars.get("emailrandom").toString());
    // 8 | click | id=contrasenia | 
    driver.findElement(By.id("contrasenia")).click();
    // 9 | type | id=contrasenia | 123456
    driver.findElement(By.id("contrasenia")).sendKeys("123456");
    // 10 | click | id=confirmar | 
    driver.findElement(By.id("confirmar")).click();
    // 11 | type | id=confirmar | 123456
    driver.findElement(By.id("confirmar")).sendKeys("123456");
    // 12 | click | id=firstName | 
    driver.findElement(By.id("firstName")).click();
    // 13 | type | id=firstName | nombre
    driver.findElement(By.id("firstName")).sendKeys("nombre");
    // 14 | click | id=lastName | 
    driver.findElement(By.id("lastName")).click();
    // 15 | type | id=lastName | apellido
    driver.findElement(By.id("lastName")).sendKeys("apellido");
    // 16 | click | css=.btn | 
    driver.findElement(By.cssSelector(".btn")).click();
    // 17 | click | linkText=Pinche aqui para iniciar sesion | 
    driver.findElement(By.linkText("Pinche aqui para iniciar sesion")).click();
    // 18 | click | id=username | 
    driver.findElement(By.id("username")).click();
    // 19 | type | id=username | ${emailrandom}
    driver.findElement(By.id("username")).sendKeys(vars.get("emailrandom").toString());
    // 20 | click | id=password | 
    driver.findElement(By.id("password")).click();
    // 21 | type | id=password | 123456
    driver.findElement(By.id("password")).sendKeys("123456");
    // 22 | click | css=.btn | 
    driver.findElement(By.cssSelector(".btn")).click();
    // 23 | click | linkText=Editar | 
    driver.findElement(By.linkText("Editar")).click();
    // 24 | click | id=contr | 
    driver.findElement(By.id("contr")).click();
    // 25 | type | id=contr | 12
    driver.findElement(By.id("contr")).sendKeys("12");
    // 26 | click | id=confirmar | 
    driver.findElement(By.id("confirmar")).click();
    // 27 | type | id=confirmar | 12
    driver.findElement(By.id("confirmar")).sendKeys("12");
    // 28 | click | css=.btn | 
    driver.findElement(By.cssSelector(".btn")).click();
    // 29 | executeScript | return document.getElementById("contr").validationMessage | message
    vars.put("message", js.executeScript("return document.getElementById(\"contr\").validationMessage"));
    // 30 | echo | ${message} | 
    System.out.println(vars.get("message").toString());
    // 31 | assert | message | Utiliza un formato que coincida con el solicitado
    assertEquals(vars.get("message").toString(), "Utiliza un formato que coincida con el solicitado");
  }
  @Test
  public void perfilcontraseniadistinta() {
    // Test name: Perfil_contrasenia_distinta
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://localhost:8080/");
    // 2 | setWindowSize | 1536x824 | 
    driver.manage().window().setSize(new Dimension(1536, 824));
    // 3 | click | linkText=Registrarse | 
    driver.findElement(By.linkText("Registrarse")).click();
    // 4 | executeScript | return "ual-" + Math.floor(Math.random()*1500000) + "@ual.es" | emailrandom
    vars.put("emailrandom", js.executeScript("return \"ual-\" + Math.floor(Math.random()*1500000) + \"@ual.es\""));
    // 5 | echo | ${emailrandom} | 
    System.out.println(vars.get("emailrandom").toString());
    // 6 | click | id=email | 
    driver.findElement(By.id("email")).click();
    // 7 | type | id=email | ${emailrandom}
    driver.findElement(By.id("email")).sendKeys(vars.get("emailrandom").toString());
    // 8 | click | id=contrasenia | 
    driver.findElement(By.id("contrasenia")).click();
    // 9 | type | id=contrasenia | 123456
    driver.findElement(By.id("contrasenia")).sendKeys("123456");
    // 10 | click | id=confirmar | 
    driver.findElement(By.id("confirmar")).click();
    // 11 | type | id=confirmar | 123456
    driver.findElement(By.id("confirmar")).sendKeys("123456");
    // 12 | click | id=firstName | 
    driver.findElement(By.id("firstName")).click();
    // 13 | type | id=firstName | nombre
    driver.findElement(By.id("firstName")).sendKeys("nombre");
    // 14 | click | id=lastName | 
    driver.findElement(By.id("lastName")).click();
    // 15 | type | id=lastName | apellido
    driver.findElement(By.id("lastName")).sendKeys("apellido");
    // 16 | click | css=.btn | 
    driver.findElement(By.cssSelector(".btn")).click();
    // 17 | click | linkText=Pinche aqui para iniciar sesion | 
    driver.findElement(By.linkText("Pinche aqui para iniciar sesion")).click();
    // 18 | click | id=username | 
    driver.findElement(By.id("username")).click();
    // 19 | type | id=username | ${emailrandom}
    driver.findElement(By.id("username")).sendKeys(vars.get("emailrandom").toString());
    // 20 | click | id=password | 
    driver.findElement(By.id("password")).click();
    // 21 | type | id=password | 123456
    driver.findElement(By.id("password")).sendKeys("123456");
    // 22 | click | css=.btn | 
    driver.findElement(By.cssSelector(".btn")).click();
    // 23 | click | linkText=Editar | 
    driver.findElement(By.linkText("Editar")).click();
    // 24 | click | id=contr | 
    driver.findElement(By.id("contr")).click();
    // 25 | type | id=contr | 1234567
    driver.findElement(By.id("contr")).sendKeys("1234567");
    // 26 | click | id=confirmar | 
    driver.findElement(By.id("confirmar")).click();
    // 27 | type | id=confirmar | 1234568
    driver.findElement(By.id("confirmar")).sendKeys("1234568");
    // 28 | click | css=.btn | 
    driver.findElement(By.cssSelector(".btn")).click();
    // 29 | assertAlert | La contrasenia no es igual a su confirmacion | 
    assertThat(driver.switchTo().alert().getText(), is("La contrasenia no es igual a su confirmacion"));
    // 30 | click | css=.btn | 
    driver.findElement(By.cssSelector(".btn")).click();
  }
}
