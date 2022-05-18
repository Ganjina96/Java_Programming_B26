package Office_Hours.day27;

import Office_Hours.day26.driverTask.*;

public class P04_TakeScreenshot_JS {
    public static void main(String[] args) {

        // How to take screenshot
        WebDriver driver=new ChromeDriver();


        ((RemoteWebDriver)driver).TakeScreenShot("pic001");

        ((TakeScreenshot)driver).TakeScreenShot("pic002");


        // how to executeScripts
        ((JavaScriptExecuter)driver).executeScript("Executing Script");





    }
}
