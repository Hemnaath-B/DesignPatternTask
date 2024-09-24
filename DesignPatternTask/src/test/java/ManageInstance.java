import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageInstance {
    private static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver ==null){
            driver=new ChromeDriver();

        }
        return driver;
    }

    public static void stopDriver(){
       driver.quit();
    }
}
