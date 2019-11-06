

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class UITest {
 @Test
    public void NewTest () {
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\minnigaliev\\IdeaProjects2\\UITest\\chromedriver.exe");
  ChromeOptions options = new ChromeOptions();
  options.addArguments("start-maximized"); // open Browser in maximized mode
  options.addArguments("disable-infobars"); // disabling infobars
  options.addArguments("--disable-extensions"); // disabling extensions
  options.addArguments("--disable-gpu"); // applicable to windows os only
  options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
  options.addArguments("--no-sandbox"); // Bypass OS security mode
     ChromeDriver driver = new ChromeDriver();
     driver.get("https://yandex.ru");
 }

}


