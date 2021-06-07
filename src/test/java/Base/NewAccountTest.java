package Base;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.NewAccountPage;
import pages.NewCustomerPage;

public class NewAccountTest {
    WebDriver driver;
    protected NewAccountPage newAccountPage;

    @BeforeEach
    public void refresh() {
        System.setProperty("webdriver.chrome.driver", "D:/KIEM THU PHAN MEM/guru99selenium-master/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.demo.guru99.com/V4/manager/addAccount.php");
    }

    @Test
    @DisplayName("TC001")
    public void TestCase001() {
        newAccountPage = new NewAccountPage(driver);
        newAccountPage.setCustomer_id("66040");
        newAccountPage.setAccountType("savings");
        newAccountPage.setInitialDeposit("10000");
        newAccountPage.clickSubmitButton();
    }

//    @AfterEach
//    public void tearDown() {
//        driver.quit();
//    }
}
