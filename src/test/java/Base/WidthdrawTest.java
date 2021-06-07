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
import pages.WidthdrawPage;

public class WidthdrawTest {
    WebDriver driver;
    protected WidthdrawPage widthdrawPage;

    @BeforeEach
    public void refresh() {
        System.setProperty("webdriver.chrome.driver", "D:\\KIEM THU PHAN MEM\\guru99selenium-master\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.demo.guru99.com/V4/manager/WithdrawalInput.php");
    }

    @Test
    @DisplayName("TC001")
    public void TestCase001() {
        widthdrawPage = new WidthdrawPage(driver);
        widthdrawPage.setAccountNo("93653");
        widthdrawPage.setAmount("10000");
        widthdrawPage.setDesc("rut tien");
        widthdrawPage.clickSubmitButton();
    }

//    @AfterEach
//    public void tearDown() {
//        driver.quit();
//    }
}
