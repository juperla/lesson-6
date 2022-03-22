package mantis.tests;

import mantis.pages.MantisSite;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class ReportIssueTests extends BaseTest {

    private MantisSite mantisSite;

    @Test
    public void checkIssuesNumber() {
        mantisSite = new MantisSite(driver);
        mantisSite.login("admin", "admin20");

        mantisSite.getMainPage().goToReportIssuePage();

        SoftAssertions softAssert = new SoftAssertions();
        softAssert.assertThat(driver.findElement(By.name("summary")).getText()).isEqualTo("summary");
        softAssert.assertThat(driver.findElement(By.name("description")).getText()).isEqualTo("description");


    }

}
