package opencart.element;

import opencart.page.CategoryPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

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

    public NavigationalBarElement(WebDriver driver) {
        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(driver)), this);
    }

    public void clickDesktopsLink() {
        desktopsLink.click();
    }

    public void clickLaptopsAndNotebooksLink() {
        laptopsAndNotebooksLink.click();
    }

    public void clickComponentsLink() {
        componentsLink.click();
    }

    public CategoryPage clickTabletsLink() {
        tabletsLink.click();
        return com.frameworkium.core.ui.pages.PageFactory.newInstance(CategoryPage.class);
    }

}
