package opencart.page;

import com.frameworkium.core.ui.pages.BasePage;
import com.frameworkium.core.ui.pages.PageFactory;
import opencart.element.NavigationalBarElement;

public class HomePage extends BasePage<HomePage> {

    public static HomePage open() {
        return PageFactory.newInstance(HomePage.class, "http://demo.opencart.com");
    }

    public NavigationalBarElement getNavigationalBar() {
        return new NavigationalBarElement(driver);
    }

}
