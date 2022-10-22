package AhlanPost18.pages;

import AhlanPost18.drivers.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
    private WebDriver driver;

    public Search() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='noo-search']")
    WebElement btnSearch;

    @FindBy(xpath = "//input[@name='s']")
    WebElement inputSearch;

    @FindBy(xpath = "//a[contains(text(),'playboy x missguided plus size grey lips print fro')]")
    WebElement txtShirt;

public void search(){
    btnSearch.click();
    System.out.println("Search");
    inputSearch.sendKeys("PLAYBOY");
    inputSearch.sendKeys(Keys.ENTER);
    System.out.println("Search Successfully");
    }

    public String getTxtShirt(){
      return txtShirt.getText();
    }
}