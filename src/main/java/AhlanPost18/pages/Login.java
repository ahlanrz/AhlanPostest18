package AhlanPost18.pages;

import AhlanPost18.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    private WebDriver driver;

    public Login() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='username']")
    WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @FindBy(xpath = "//button[@name='login']")
    WebElement login;

    public void login(String userName, String password) {
        this.username.sendKeys("kanslay@gmail.com");
        System.out.println("Insert Username");
        this.password.sendKeys("k4nslay@123");
        System.out.println("Insert Password");
        login.click();
    }
}
