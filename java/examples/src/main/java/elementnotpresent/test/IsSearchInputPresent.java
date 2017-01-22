package elementnotpresent.test;

import com.frameworkium.core.ui.tests.BaseTest;
import elementnotpresent.page.Homepage;
import org.testng.annotations.Test;

import static com.google.common.truth.Truth.assert_;

public class IsSearchInputPresent extends BaseTest {

    @Test(description = "To check whether the search input field is present on-screen")
    public static void isSearchInputPresent() {
        Homepage homepage = Homepage.open();

        assert_().withFailureMessage("Search input is displayed")
                .that(homepage.isSearchInputDisplayed())
                .isFalse();

        assert_().withFailureMessage("Search input is not present")
                .that(homepage.isSearchInputPresent())
                .isTrue();

        assert_().withFailureMessage("Search submit button is present")
                .that(homepage.isSearchSubmitPresent())
                .isFalse();

        assert_().withFailureMessage("Search submit button is present")
                .that(homepage.isSearchSubmitDisplayed())
                .isFalse();
    }

}
