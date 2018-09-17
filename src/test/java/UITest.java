import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.switchTo;


public class UITest {
        @Test
        public void yandexSearch() {

            Configuration.browser="chrome";

            Selenide.clearBrowserCookies();
            //Открываем Яндекс
            open("https://www.yandex.ru");
            //Вводим ЕЭТП в поле поиска и нажимаем Enter
            $(By.id("text")).val("ЕЭТП").pressEnter();


            $(By.xpath("//b[3]")).click();
            //Так как ссылка откроется в новом окне, переключаемся на него
            switchTo().window(1);



            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            $(By.cssSelector("a.g-register-btn.js-register-popup-link")).click();
            $(By.xpath("//a[2]/i/img")).click();

            $(By.xpath("//div[2]/div/div/div/div/a")).click();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

