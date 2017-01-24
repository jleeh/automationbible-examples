package opencart.test;

import com.frameworkium.core.ui.tests.BaseTest;
import opencart.element.ProductBoxElement;
import opencart.page.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static com.google.common.truth.Truth.assert_;

public class ViewProductTest extends BaseTest {

    @Test(description = "Test to view a featured product to assert they load correctly")
    public static void viewProductTest() {
        WebDriver driver = getDriver();

        HomePage homePage = HomePage.open(driver);
        ProductBoxElement productBoxElement = homePage.getProductBoxByIndex(0);
        String productName = productBoxElement.getName();

        assert_().withFailureMessage("Product names don't match")
                .that(productBoxElement.clickName(driver).getProductName())
                .isEqualTo(productName);
    }

}
