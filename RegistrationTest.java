package FinalWork1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class RegistrationTest extends DataTest {
    private By btnRegister = By.xpath("//div[@class ='<a href=\"https://test-stand.gb.ru/'] ");
    private By inputPassword = By.xpath("//*[@id=\"login\"]/div[2]/label/input");
    private By inputUsername = By.xpath("//*[@id=\"login\"]/div[1]/label/span[2]");

    private By btnLogin = By.xpath("//*[@id=\"login\"]/div[3]/button/div");

    //private static WebDriver driver;


    @Test
    public void registration() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // driver.get("https://google.com");

        DataTest getDataTest = new DataTest();
        driver.get(getDataTest.getBaseUrl);
        // driver.findElement(btnRegister).click();
        driver.findElement(inputPassword).sendKeys(getDataTest.password);
        driver.findElement(inputUsername).sendKeys(getDataTest.username);
        driver.findElement(btnLogin).click();


        // driver.quit();
    }

}

