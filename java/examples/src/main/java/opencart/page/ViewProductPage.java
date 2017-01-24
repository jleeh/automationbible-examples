package opencart.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

public class ViewProductPage {

    @Name("Product Name")
    @FindBy(tagName = "h1")
    private WebElement productName;

    public ViewProductPage(WebDriver driver) {
        HtmlElementLoader.populatePageObject(this, driver);
    }

    public String getProductName() {
        return productName.getText();
    }

}
