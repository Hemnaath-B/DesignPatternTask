import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Main {

    WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver= ManageInstance.getDriver();
    }

    @Test
    public void fillForm(){
        User user = new UserBuilder().setFirstName("Hemnaath").setLastname("B").setJob("Tester").build();

        driver.get("https://formy-project.herokuapp.com/form");
        driver.findElement(By.cssSelector("input[id='first-name']")).sendKeys(user.getFirstname());
        driver.findElement(By.id("last-name")).sendKeys(user.getLastname());
        driver.findElement(By.id("job-title")).sendKeys(user.getJobtitle());
        driver.findElement(By.id("radio-button-2")).click();
        driver.findElement(By.id("checkbox-1")).click();

        Select option =new Select(driver.findElement(By.id("select-menu")));
        option.selectByValue("1");
        driver.findElement(By.id("datepicker")).sendKeys("09/24/2024");
        driver.findElement(By.xpath("//a[@class='btn btn-lg btn-primary']")).click();

    }

    @AfterClass
    public void tearDown(){
        ManageInstance.stopDriver();
    }
}
