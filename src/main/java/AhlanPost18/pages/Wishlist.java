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

    @FindBy(xpath = "//div[contains(@class,'no-icon wishlist-fragment on-first-load')]//a[@class='add_to_wishlist single_add_to_wishlist']")
    WebElement btnWishlist1;

    @FindBy(xpath = "//a[contains(text(),'playboy x missguided plus size grey lips print fro')]")
    WebElement txtShirt1;

    @FindBy(xpath = "//div[contains(@class,'no-icon wishlist-fragment on-first-load')]//a[@class='add_to_wishlist single_add_to_wishlist']")
    WebElement btnWishlist2;

    @FindBy(xpath = "//a[contains(text(),'playboy x missguided plus size grey lips print fro')]")
    WebElement txtShirt2;

    //validasi
    //*[@id="yith-wcwl-message"]
    public void wishlist1(){
    btnWishlist1.click();
    }


}
