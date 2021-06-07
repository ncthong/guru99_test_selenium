package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewCustomerPage {
    private WebDriver driver;
    private By customer_name=By.name("name");
    private By tfdob=By.name("dob");
    private By tfaddress=By.name("addr");
    private By tfcity=By.name("city");
    private By tfstate=By.name("state");
    private By tfpin=By.name("pinno");
    private By tfphone=By.name("telephoneno");
    private By tfemail=By.name("emailid");
    private By tfpassword=By.name("password");
    private By btsubmit=By.name("sub");

    public NewCustomerPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setCustomer_name(String name) {
        driver.findElement(customer_name).sendKeys(name);
    }

    public void setDob(String dob) {
        driver.findElement(tfdob).sendKeys(dob);
    }

    public void setAddress(String address) {
        driver.findElement(tfaddress).sendKeys(address);
    }

    public void setCity(String city) {
        driver.findElement(tfcity).sendKeys(city);
    }

    public void setState(String state) {
        driver.findElement(tfstate).sendKeys(state);
    }

    public void setPin(String pin) {
        driver.findElement(tfpin).sendKeys(pin);
    }

    public void setPhone(String phone) {
        driver.findElement(tfphone).sendKeys(phone);
    }

    public void setEmail(String email) {
        driver.findElement(tfemail).sendKeys(email);
    }

    public void setPassword(String password) {
        driver.findElement(tfpassword).sendKeys(password);
    }

    public void clickSubmitButton() {
        driver.findElement(btsubmit).click();
    }
}
