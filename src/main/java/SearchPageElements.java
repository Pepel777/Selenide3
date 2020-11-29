import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchPageElements {
    SelenideElement title = $(By.xpath("//span[@class='goods-tile__title']"));
    SelenideElement cardTitle = $(By.xpath("//a[@class='cart-product__title']"));
    SelenideElement buyBtn = $(By.xpath("//button[@class='buy-button goods-tile__buy-button']"));
    SelenideElement counter = $(By.xpath("//span[@class='header-actions__button-counter']"));
}