package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By tfUsername = By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input");
    private By tfPassword = By.name("password");
    private By btnLogin = By.name("btnLogin");
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setUserName(String userName) {
        driver.findElement(tfUsername).sendKeys(userName);
    }
    public void setPassword(String password) {
        driver.findElement(tfPassword).sendKeys(password);
    }
    public void clickLoginButton() {
        driver.findElement(btnLogin).click();
    }
}
