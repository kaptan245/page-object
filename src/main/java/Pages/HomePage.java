package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
   private WebDriver driver;
   public HomePage(WebDriver driver){
       this.driver=driver;
   }
   @Step("username alani doldurulur")
  public HomePage userNameDoldur(String text){
    driver.findElement(By.name("username")).sendKeys(text);
      return this;
  }
    public HomePage passwordDoldur(String pass) {
        driver.findElement(By.name("password")).sendKeys(pass);
        return this;
    }
    public HomePage Login() {
        driver.findElement(By.cssSelector("#loginPanel > form > div:nth-child(5) > input")).click();
        return this;
    }
    }

