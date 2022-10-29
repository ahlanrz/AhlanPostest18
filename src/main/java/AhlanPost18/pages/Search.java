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

    @FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[2]/div/div/div/a")
    WebElement btnSearch;

    @FindBy(xpath = "//input[@name='s']")
    WebElement inputSearch;

    @FindBy(xpath = "//a[contains(text(),'playboy x missguided plus size grey lips print fro')]")
    WebElement txtShirt;

    public void search() {
        btnSearch.click();
        System.out.println("Clik Button Search");
        inputSearch.sendKeys("SHIRT", Keys.ENTER);
        System.out.println("Search Item Successfully");
    }

    public String getTxtShirt() {
        return txtShirt.getText();
    }
}