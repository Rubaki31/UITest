


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class UITest {
        public ChromeDriver driver;
        @Before
        public void SetUp () {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            driver = new ChromeDriver();
        }

 @Test
    public void test1 () {

     driver.get("https://yandex.ru");
     //driver.getMouse();
     driver.findElement(By.id("text")).sendKeys("dtf");
     driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
     driver.findElement(By.xpath("//a/div[2]")).click();
     
 }
    @After
    public void close() {
            driver.quit();
    }
}


