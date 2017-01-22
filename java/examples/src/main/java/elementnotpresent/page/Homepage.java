package elementnotpresent.page;

import com.frameworkium.core.ui.pages.BasePage;
import com.frameworkium.core.ui.pages.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage<Homepage> {

    private static final String SEARCH_SELECTOR = "search";
    @FindBy(id = SEARCH_SELECTOR)
    private WebElement searchInput;

    private static final String SEARCH_SUBMIT_SELECTOR = "search-submit";
    @FindBy(id = SEARCH_SUBMIT_SELECTOR)
    private WebElement searchSubmitButton;

    public static Homepage open() {
        return PageFactory.newInstance(Homepage.class, "http://localhost/dashboard/examples/elementispresent/");
    }

    public Boolean isSearchInputDisplayed() {
        return searchInput.isDisplayed();
    }

    public Boolean isSearchInputPresent() {
        return driver.findElements(By.id(SEARCH_SELECTOR)).size() > 0;
    }

    public Boolean isSearchSubmitDisplayed() {
        try {
            return searchSubmitButton.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public Boolean isSearchSubmitPresent() {
        return driver.findElements(By.id(SEARCH_SUBMIT_SELECTOR)).size() > 0;
    }

}
