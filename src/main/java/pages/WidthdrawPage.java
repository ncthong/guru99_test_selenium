package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WidthdrawPage {
    private WebDriver driver;
    private By tfaccountNo=By.name("accountno");
    private By tfammount=By.name("ammount");
    private By tfdesc=By.name("desc");
    private By btsubmit=By.name("AccSubmit");

    public WidthdrawPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setAccountNo(String accountNo) {
        driver.findElement(tfaccountNo).sendKeys(accountNo);
    }

    public void setAmount(String amount) {
        driver.findElement(tfammount).sendKeys(amount);
    }

    public void setDesc(String desc) {
        driver.findElement(tfdesc).sendKeys(desc);
    }

    public void clickSubmitButton() {
        driver.findElement(btsubmit).click();
    }
}
