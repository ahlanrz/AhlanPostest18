package AhlanPost18.drivers.strategis;

import AhlanPost18.utils.Constants;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverStrategyImplementer {
    public static DriverStrategy chooseStrategy(String strategy) {
        switch (strategy) {
            case Constants.CHROME:
                return new Chrome();

            case Constants.FIREFOX:
                return new Firefox();

            default:
                return null;
        }
    }
}
