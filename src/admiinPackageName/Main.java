package admiinPackageName;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    WebDriver driver;

    public void invokeBrowser() {
        try {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jacek\\Documents\\IT\\java\\chrome_webdriver\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

            driver.get("http://www.onet.pl");
        } catch (Exception e) {
            e.printStackTrace();
        }
    };

    public static void main(String[] args) {

    Main myObj = new Main();
    myObj.invokeBrowser();
    }
}