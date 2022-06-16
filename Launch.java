package Mobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;public class Launch {
WebDriver driver;
@Test
public void Lanching_the_Browser() {
System.setProperty("webdriver.chrome.driver", "./sourse/chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://mobileworld.azurewebsites.net");
driver.manage().window().maximize();
}}





