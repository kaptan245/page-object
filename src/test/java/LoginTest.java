import Pages.HomePage;
import io.qameta.allure.Feature;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
 @Feature("Login Test Senaryolari")
public class LoginTest {
    private WebDriver driver;


    @BeforeMethod
    public void setup(){
        String tarayici = System.getProperty("browser");




        ChromeOptions chromeOpsions = new ChromeOptions();
        chromeOpsions.addArguments("--remote-allow-origins=*");
         driver = new ChromeDriver(chromeOpsions);
        driver.get("https://parabank.parasoft.com");
    }

    @Test(description = "test 0001 basarili login kullanicisi")
    public void TC0001(){
        HomePage homePage = new HomePage(driver);
          homePage.userNameDoldur("rifat");
          homePage.passwordDoldur("123456");
          homePage.Login();

    }
    @Test(description = "test 0002 basarili login kullanicisi")
    public void TC0002(){
        HomePage homePage = new HomePage(driver);
        homePage.userNameDoldur("tester");

    }
    @Test
    public void TC0003(){
        HomePage homePage = new HomePage(driver);
        homePage.userNameDoldur("QA  software TEST deneme");

    }
    @AfterMethod
    public void afterDown(){
        driver.quit();



    }
}
