import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


    public class UITest {
        @Test
        public void yandexSearch() {
            //Открываем яндекс
            open("https://yandex.ru");
            // Производим поиск
            $(By.id("text")).val("ЕЭТП").pressEnter();


        }
    }

