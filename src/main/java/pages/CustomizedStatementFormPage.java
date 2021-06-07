package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomizedStatementFormPage {
    private WebDriver driver;
    private By tfAccountNo=By.name("accountno");
    private By tfFDate=By.name("fdate");
    private By tfTDate=By.name("tdate");
    private By tfAmountlowerlimit=By.name("amountlowerlimit");
    private By tfNumtransaction=By.name("numtransaction");
    private By btsubmit=By.name("AccSubmit");

    public CustomizedStatementFormPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setAccountNo(String accountNo) {
        driver.findElement(tfAccountNo).sendKeys(accountNo);
    }

    public void setFDate(String fDate) {
        driver.findElement(tfFDate).sendKeys(fDate);
    }

    public void setTDate(String tDate) {
        driver.findElement(tfTDate).sendKeys(tDate);
    }

    public void setTfAmountlowerlimit(String amountlowerlimit) {
        driver.findElement(tfAmountlowerlimit).sendKeys(amountlowerlimit);
    }

    public void setTfNumtransaction(String numtransaction) {
        driver.findElement(tfNumtransaction).sendKeys(numtransaction);
    }

    public void clickSubmitButton() {
        driver.findElement(btsubmit).click();
    }
}
