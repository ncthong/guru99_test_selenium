package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FundTransferPage {
    private WebDriver driver;
    private By tfpayersAccount=By.name("payersaccount");
    private By tfpayeeAccount=By.name("payeeaccount");
    private By tfamount=By.name("ammount");
    private By tfdesc=By.name("desc");
    private By btsubmit=By.name("AccSubmit");

    public FundTransferPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setPayersAccount(String payersAccount) {
        driver.findElement(tfpayersAccount).sendKeys(payersAccount);
    }

    public void setPayeeAccount(String payeeAccount) {
        driver.findElement(tfpayeeAccount).sendKeys(payeeAccount);
    }

    public void setAmmount(String amount) {
        driver.findElement(tfamount).sendKeys(amount);
    }

    public void setDesc(String desc) {
        driver.findElement(tfdesc).sendKeys(desc);
    }

    public void clickSubmitButton() {
        driver.findElement(btsubmit).click();
    }
}
