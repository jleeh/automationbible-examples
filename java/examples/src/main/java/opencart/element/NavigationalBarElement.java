package opencart.element;

import opencart.page.CategoryPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

@FindBy(css = "nav.navbar")
public class NavigationalBarElement extends HtmlElement {

    @Name("Desktops Link")
    @FindBy(linkText = "Desktops")
    private WebElement desktopsLink;

    @Name("Laptops & Notebooks Link")
    @FindBy(linkText = "Laptops & Notebooks")
    private WebElement laptopsAndNotebooksLink;

    @Name("Components Link")
    @FindBy(linkText = "Components")
    private WebElement componentsLink;

    @Name("Tablets Link")
    @FindBy(linkText = "Tablets")
    private WebElement tabletsLink;

    public void clickDesktopsLink() {
        desktopsLink.click();
    }

    public void clickLaptopsAndNotebooksLink() {
        laptopsAndNotebooksLink.click();
    }

    public void clickComponentsLink() {
        componentsLink.click();
    }

    public CategoryPage clickTabletsLink(WebDriver driver) {
        tabletsLink.click();
        return new CategoryPage(driver);
    }

}
