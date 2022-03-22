package mantis.tests;

import mantis.pages.MantisSite;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class ViewingIssuesTests extends BaseTest {

    private MantisSite mantisSite;

    @Test
    public void checkIssuesNumber() {
        mantisSite = new MantisSite(driver);
        mantisSite.login("admin", "admin20");

        mantisSite.getMainPage().goToViewIssuesPage();
        mantisSite.getViewIssuesPage().bugReportNumber();
        mantisSite.getViewIssuesPage().getNewIssueSummary();


        SoftAssertions softAssert = new SoftAssertions();
        softAssert.assertThat(driver.findElement(By.cssSelector("#buglist  tbody  tr:nth-child(1)  td.column-id  a")).getText()).isEqualTo("new bug");

        String actualIssueSummary = mantisSite.getViewIssuesPage().getNewIssueSummary();
        softAssert.assertThat(actualIssueSummary).isEqualTo("new bug");
        String idNewIssue = mantisSite.getViewIssuesPage().getLastIssueId();

        mantisSite.getMainPage().goToViewIssuesPage();
        mantisSite.getViewIssuesPage().deleteButton();
        mantisSite.getViewIssuesPage().reportDeleteIssueButton();

        String actualFirstIssueID = mantisSite.getViewIssuesPage().getLastIssueId();
        softAssert.assertThat(idNewIssue).isNotEqualTo(actualFirstIssueID);

    }
}
