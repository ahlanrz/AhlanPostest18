package AhlanPost18;

import AhlanPost18.drivers.DriverSingleton;
import AhlanPost18.pages.Home;
import AhlanPost18.pages.Login;
import AhlanPost18.pages.Search;
import AhlanPost18.pages.Wishlist;
import AhlanPost18.utils.Constants;
import org.openqa.selenium.*;

public class MainApp {
    public static void main(String[] args) {

        DriverSingleton.getInstance(Constants.CHROME);
        WebDriver driver = DriverSingleton.getDriver();
        driver.get(Constants.URL);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        Home home = new Home();
        home.home();

        js.executeScript("window.scrollBy(0,500)");
        delay(1);

        //login
        Login login = new Login();
        login.login("kanslay2@gmail.com", "k4nslay@123");
        System.out.println("Login Succesfully");
        delay(1);

        driver.get("https://shop.demoqa.com");
        System.out.println("Back Dashboard");
        delay(1);

        Search search = new Search();
        search.search();
//        System.out.println("Search");
        delay(1);

        js.executeScript("window.scrollBy(0,600)");
        delay(1);

        Wishlist wishlist1 = new Wishlist();
        wishlist1.Wishlist1();
        System.out.println("Add Wishlist 1 Succes");
        delay(1);
    }

    static void delay ( int detik){
        try {
            Thread.sleep(1000 * detik);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}