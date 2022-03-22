package mantis.tests;

import mantis.pages.MantisSite;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class ViewingIssuesTests extends BaseTest {

    private MantisSite mantisSite;

    @Test
    public void checkIssuesNumber() {
        mantisSite = new MantisSite(driver);
        mantisSite.login("admin", "admin20");

        mantisSite.getMainPage().goToViewIssuesPage();

        SoftAssertions softAssert = new SoftAssertions();
        softAssert.assertThat(driver.findElement(By.xpath("//table[@id='buglist']/tbody/tr[1]/td[4]/a")).getText()).isEqualTo("buglist");

    }

}
