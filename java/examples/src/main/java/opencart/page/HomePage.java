package opencart.page;

import opencart.element.NavigationalBarElement;
import opencart.element.ProductBoxElement;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

import java.util.List;

public class HomePage {

    private NavigationalBarElement navigationalBarElement;
    private List<ProductBoxElement> productBoxElements;

    public static HomePage open(WebDriver driver) {
        driver.get("http://demo.opencart.com");
        HomePage homePage = new HomePage();
        HtmlElementLoader.populatePageObject(homePage, driver);
        return homePage;
    }

    public NavigationalBarElement getNavigationalBar() {
        return navigationalBarElement;
    }

    public List<ProductBoxElement> getProductBoxes() {
        return productBoxElements;
    }

    public ProductBoxElement getProductBoxByIndex(int i) {
        return productBoxElements.get(i);
    }

    public ProductBoxElement getProductBoxByName(final String productName) {
        return productBoxElements.stream()
                .filter(productBoxElement -> productBoxElement.getName().equals(productName))
                .findFirst()
                .orElseThrow(() -> new AssertionError("Product with name '"+ productName +"' not found"));
    }

}
