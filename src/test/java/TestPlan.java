import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestPlan {
    private static  final WebDriver driver = new ChromeDriver();
    @BeforeSuite
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver",Utils.driverLocation);
    }

    @Test
    public static void validCredentiasl() throws InterruptedException {
        driver.get(Utils.url);
        LoginPage login = new LoginPage(driver);

        login.setEmail();
        Thread.sleep(3000);
        login.setPassword();
        Thread.sleep(3000);
        login.clickSubmit();
    }
    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
