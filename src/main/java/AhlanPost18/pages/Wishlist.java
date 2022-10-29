package AhlanPost18.pages;

import AhlanPost18.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlist {
    private WebDriver driver;

    public Wishlist() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div[3]/div/div[1]/div[1]/div[2]/div/a")
    WebElement btnWishlist1;

    @FindBy(xpath = "//a[contains(text(),'playboy x missguided plus size grey lips print fro')]")
    WebElement txtShirt1;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div[3]/div/div[1]/div[1]/div[2]/div/a")
    WebElement btnWishlist2;

    @FindBy(xpath = "//a[normalize-space()='black lux graphic t-shirt']")
    WebElement txtShirt2;

    public void Wishlist1() {
        btnWishlist1.click();
        System.out.println("Shirt One");
    }

    public void Wishlist2() {
        btnWishlist2.click();
        System.out.println("Shirt Two");
    }

    public String getTxtProductOne(){
        return txtShirt1.getText();
    }
    public String getTxtProductTwo() {
        return txtShirt2.getText();
    }
}
