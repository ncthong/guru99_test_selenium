package Base;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.NewCustomerPage;

public class NewCustomerTest {

    WebDriver driver;
    protected NewCustomerPage newCustomerPage;

    @BeforeEach
    public void refresh() {
        System.setProperty("webdriver.chrome.driver", "D:/KIEM THU PHAN MEM/guru99selenium-master/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.demo.guru99.com/V4/manager/addcustomerpage.php");
    }

    @Test
    @DisplayName("TC001")
    public void TestCase001() {
        newCustomerPage = new NewCustomerPage(driver);
        newCustomerPage.setCustomer_name("LNS");
        newCustomerPage.setDob("01/01/1999");
        newCustomerPage.setAddress("Nguyen Tao");
        newCustomerPage.setCity("Da Nang");
        newCustomerPage.setState("Ngu Hanh Son");
        newCustomerPage.setPin("123456");
        newCustomerPage.setPhone("345");
        newCustomerPage.setEmail("lns@gmail.com");
        newCustomerPage.setPassword("123123");
        newCustomerPage.clickSubmitButton();
    }

//    @AfterEach
//    public void tearDown() {
//        driver.quit();
//    }
}
