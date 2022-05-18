package Office_Hours.day27;

import Office_Hours.day26.driverTask.ChromeDriver;
import Office_Hours.day26.driverTask.SafariDriver;
import Office_Hours.day26.driverTask.WebDriver;

public class InstanceOf {
    public static void main(String[] args) {

        // Create a method that will return us a webdriver based on user inputs

        WebDriver driver = DriverUtil.getDriver("safari");

        if (driver instanceof SafariDriver){
            ((SafariDriver) driver).fast();
            ((SafariDriver) driver).secure();
            ((SafariDriver) driver).talk();
        }

        System.out.println("------------------------------------------------------");

        WebDriver driver2 = DriverUtil.getDriver("firefox");

        if (driver2 instanceof ChromeDriver){
            driver2.get("www.google.com");
        } else if (driver2 instanceof SafariDriver) {
            ((SafariDriver) driver2).secure();

        }else {
            driver2.get("www.google.com");
        }


    }
}
