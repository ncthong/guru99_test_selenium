package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By btnLogout = By.xpath("/html/body/div[3]/div/ul/li[15]/a");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickLogoutButton() {
        driver.findElement(btnLogout).click();
    }
}
