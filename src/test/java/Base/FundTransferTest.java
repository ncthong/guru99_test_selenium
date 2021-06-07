package Base;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.DepositPage;
import pages.FundTransferPage;

public class FundTransferTest {
    WebDriver driver;
    protected FundTransferPage fundTransferPage;

    @BeforeEach
    public void refresh() {
        System.setProperty("webdriver.chrome.driver", "D:/KIEM THU PHAN MEM/guru99selenium-master/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.demo.guru99.com/V4/manager/FundTransInput.php");
    }

    @Test
    @DisplayName("TC001")
    public void TestCase001() {
        fundTransferPage = new FundTransferPage(driver);
        fundTransferPage.setPayersAccount("93653");
        fundTransferPage.setPayeeAccount("654321");
        fundTransferPage.setAmmount("10000");
        fundTransferPage.setDesc("rut tien");
        fundTransferPage.clickSubmitButton();
    }

//    @AfterEach
//    public void tearDown() {
//        driver.quit();
//    }
}
