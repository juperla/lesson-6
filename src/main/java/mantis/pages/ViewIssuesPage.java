package mantis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ViewIssuesPage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    @FindBy(css = "#buglist tbody tr")
    private List<WebElement> issues;

    @FindBy(css = "#buglist  tbody  tr:nth-child(1)  td.column-id  a")
    private WebElement bugReportNumber;

    @FindBy(css = "#buglist tbody tr:nth-child(1) td.column-summary")
    private WebElement newIssueSummary;

    @FindBy(css = "#main-container table div:nth-child(10)")
    private WebElement deleteButton;

    @FindBy(xpath = "//*[@id='action-group-div']/form/div/div[2]/div[2]/input")
    private WebElement reportDeleteIssueButton;

    public ViewIssuesPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30, 500);
        PageFactory.initElements(driver, this);
    }

    public int countIssues() {
        return issues.size();
    }
    public void bugReportNumber() {
        bugReportNumber.click();}
    public String getNewIssueSummary() {
        return newIssueSummary.getText();}
    public void deleteButton() {
        deleteButton.click(); }
    public void reportDeleteIssueButton() {
        reportDeleteIssueButton.click(); }
}
