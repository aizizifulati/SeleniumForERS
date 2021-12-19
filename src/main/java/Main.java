import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;





public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        Thread.sleep(3000);
        driver.get("http://localhost:9000");



        Wait<WebDriver> wait;

        WebElement usernameInputElem;
        WebElement passwordInputElem;
        WebElement loginButtonElem;


        String username ="lana01";
        String password="123456";


        usernameInputElem=driver.findElement(By.id("username-input"));
        passwordInputElem=driver.findElement(By.id("password-input"));
        loginButtonElem=driver.findElement(By.id("login-btn"));

        Thread.sleep(5000);

        usernameInputElem.sendKeys(username);
        passwordInputElem.sendKeys(password);

        Thread.sleep(5000);
        loginButtonElem.click();

        Thread.sleep(5000);

        WebElement myrem=driver.findElement(By.id("rem-btn"));
        Thread.sleep(2500);
        myrem.click();
        Thread.sleep(1000);

        WebElement employeDashbtn=driver.findElement(By.id("employe-dashbord-btn"));
        Thread.sleep(2000);
        employeDashbtn.click();

        WebElement newRequest=driver.findElement(By.id("New Reimbursement Request"));
        Thread.sleep(2000);
        newRequest.click();

        Thread.sleep(2000);
        String amount ="999";
        String description ="Travel to Hawaii";
        Select dropdown=new Select(driver.findElement(By.id("type")));
        Thread.sleep(2000);
        WebElement amountInputElem=driver.findElement(By.id("amount"));
        WebElement descriptionInputElem=driver.findElement(By.id("description"));
        WebElement submitBtnElem=driver.findElement(By.id("sbumit-btn"));

        Thread.sleep(2000);
        amountInputElem.sendKeys(amount);
        Thread.sleep(2000);
        descriptionInputElem.sendKeys(description);
        Thread.sleep(2000);
        dropdown.selectByValue("2");
        Thread.sleep(2000);
        submitBtnElem.click();

        Thread.sleep(2000);

        driver.switchTo().alert().accept();

        Thread.sleep(2000);


        //logout-btn
        WebElement logout=driver.findElement(By.id("logout-btn"));
        logout.click();
        Thread.sleep(2000);
        driver.quit();

















    }
}
