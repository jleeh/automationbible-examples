package opencart.element;

import opencart.page.ViewProductPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

@FindBy(css = "div.product-layout > div")
public class ProductBoxElement extends HtmlElement {

    @Name("name")
    @FindBy(tagName = "h4 a")
    private WebElement name;

    @Name("Description")
    @FindBy(css = "p:not(.price)")
    private WebElement description;

    @Name("Price")
    @FindBy(css = "p.price")
    private WebElement price;

    public ViewProductPage clickName(WebDriver driver) {
        name.click();
        return new ViewProductPage(driver);
    }

    public String getName() {
        return name.getText();
    }

    public String getDescription() {
        return description.getText();
    }

    public String getPrice() {
        return price.getText();
    }

}
