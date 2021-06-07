package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccountPage {
    private WebDriver driver;
    private By tfcustomer_id=By.name("cusid");
    private By tfaccountType=By.name("selaccount");
    private By tfinitialDeposit=By.name("inideposit");
    private By btsubmit=By.name("button2");

    public NewAccountPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setCustomer_id(String cusid) {
        driver.findElement(tfcustomer_id).sendKeys(cusid);
    }

    public void setAccountType(String accountType) {
        driver.findElement(tfaccountType).sendKeys(accountType);
    }

    public void setInitialDeposit(String initialDeposit) {
        driver.findElement(tfinitialDeposit).sendKeys(initialDeposit);
    }

    public void clickSubmitButton() {
        driver.findElement(btsubmit).click();
    }
}
