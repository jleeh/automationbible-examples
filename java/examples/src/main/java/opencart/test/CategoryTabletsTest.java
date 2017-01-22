package opencart.test;

import com.frameworkium.core.ui.tests.BaseTest;
import opencart.page.HomePage;
import org.testng.annotations.Test;

import static com.google.common.truth.Truth.assert_;

public class CategoryTabletsTest extends BaseTest {

    @Test(description = "Test to see whether the tablets category page loads and displays a title")
    public static void categoryTabletsTest() {
        String categoryName = HomePage.open()
                .getNavigationalBar()
                .clickTabletsLink()
                .getCategoryName();

        assert_().withFailureMessage("Tablets category page didn't correctly show!")
                .that(categoryName)
                .isEqualTo("Tablets");
    }

}
