package mantis.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ViewingIssuesPage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    @FindBy(xpath="//table[@id='buglist']/tbody/tr[1]/td[4]/a")
    private WebElement bugReportNumber;

    @FindBy(xpath="//*[@id='main-container']/div[2]/div[2]/div/div[1]/div/div[2]/div[2]/div/table/tfoot/tr/td/div/div[10]/form/fieldset/input[3]")
    private WebElement deleteButton;

    @FindBy(xpath = "//input[@value='Delete Issues']")
    private WebElement reportDeleteIssuePageButton;

    public ViewingIssuesPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30, 500);
        PageFactory.initElements(driver, this);
    }

    public void bugReportNumber() {
        bugReportNumber.click(); }
    public void deleteButton() {
        deleteButton.click(); }
    public void reportDeleteIssuePageButton() {
        reportDeleteIssuePageButton.click(); }

}
