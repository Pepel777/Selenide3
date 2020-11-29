import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;


public class TestWithPageObject {
    @BeforeMethod
    public void before() {
        Configuration.startMaximized = true;
        Configuration.timeout = 5000;
        open("https://rozetka.com.ua");
    }

    @Test
    public void testSelenide() {
        new MainPageLogic()
                .clickOnCategoryJS()
                .clickCategory(new CategoryPageLogic().laptopCategory)
                .buyProduct()
                .checkProductQuantity()
                .productsCompare();
    }
}
