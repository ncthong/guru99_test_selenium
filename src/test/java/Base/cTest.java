package Base;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.DepositPage;
import pages.NewAccountPage;

public class DepositTest {
    WebDriver driver;
    protected DepositPage depositPage;

    @BeforeEach
    public void refresh() {
        System.setProperty("webdriver.chrome.driver", "D:/KIEM THU PHAN MEM/guru99selenium-master/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.demo.guru99.com/V4/manager/DepositInput.php");
    }

    @Test
    @DisplayName("Test Deposit")
    public void TestCase001() {
        depositPage = new DepositPage(driver);
        depositPage.setAccountNo("93653");
        depositPage.setAmount("10000");
        depositPage.setDesc("gui tien");
        depositPage.clickSubmitButton();
    }

//    @AfterEach
//    public void tearDown() {
//        driver.quit();
//    }
}
