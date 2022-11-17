package admiinPackageName;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    WebDriver driver;

    public void invokeBrowser() {
        System.setProperty("webdriver.chrome.driver", "\"C:\\Users\\Jacek\\Downloads\\chromedriver.exe\"");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

    };

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}