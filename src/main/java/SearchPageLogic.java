import static com.codeborne.selenide.Condition.text;
import org.testng.Assert;

public class SearchPageLogic extends SearchPageElements {

    public SearchPageLogic buyProduct() {
        buyBtn.click();
        return this;
    }

    public SearchPageLogic checkProductQuantity() {
        counter.shouldHave(text("1")).click();
        return this;
    }

    public void productsCompare() {
        Assert.assertEquals(title.text(), cardTitle.text());
    }
}