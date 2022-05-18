package Office_Hours.day27;

import Office_Hours.day26.driverTask.ChromeDriver;
import Office_Hours.day26.driverTask.FirefoxDriver;
import Office_Hours.day26.driverTask.SafariDriver;
import Office_Hours.day26.driverTask.WebDriver;

import java.sql.Driver;

public class DriverUtil {

    public static WebDriver getDriver(String browserName){

        WebDriver driver;

        switch (browserName){
            case "chrome":
                // WebDriverManager.chromedriver().Setup();
                driver = new ChromeDriver();
                break;
            case "safari":
                // WebDriverManager.safaridriver().Setup();
                driver = new SafariDriver();
                break;
            case "firefox":
                // WebDriverManager.firefoxdriver().Setup();
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Unsupported browser");
                driver = null;
        }
        return driver;
    }
}
