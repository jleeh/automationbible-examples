package opencart.page;

import com.frameworkium.core.ui.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;

public class CategoryPage extends BasePage<CategoryPage> {

    @Name("Category Name")
    @FindBy(tagName = "h2")
    private WebElement categoryName;

    public String getCategoryName() {
        return categoryName.getText();
    }

}
