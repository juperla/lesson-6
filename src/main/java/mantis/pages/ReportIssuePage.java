package mantis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReportIssuePage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    @FindBy(name="summary")
    private WebElement summaryField;

    @FindBy(name="description")
    private WebElement descriptionField;

    @FindBy(className = "btn btn-primary btn-white btn-round")
    private WebElement submitButton;


    public ReportIssuePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30, 500);
        PageFactory.initElements(driver, this);
    }

    public void inputSummary(String summary) {
        summaryField.sendKeys(summary); }

    public void inputDescription(String description) {
        descriptionField.sendKeys(description); }

    public void clickSubmitButton() {
        submitButton.click(); }

}
