import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


    public class UITest {
        @Test
        public void yandexSearch() {
            //WebDriver driver =new ChromeDriver();

            Selenide.clearBrowserCookies();
            //Открываем Яндекс
            open("https://www.yandex.ru");
            //Вводим ЕЭТП в поле поиска и нажимаем Enter
            $(By.id("text")).val("ЕЭТП").pressEnter();

            //$("#ires .g").shouldHave(text("Roseltorg.ru"));
            $(By.xpath("//b[3]")).click();

            $(By.cssSelector("a.g-register-btn.js-register-popup-link")).click();
            $(By.cssSelector("img[alt=\"Поставщик\"]")).click();
            $(By.xpath("xpath=//a[contains(text(),'Поставщик')]")).click();

        }
    }

