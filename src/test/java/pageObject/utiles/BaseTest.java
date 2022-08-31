package pageObject.utiles;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseTest {

    public WebDriver driver;

    public Utility util;

        @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    // Navegador
//        WebDriver driver;
    @BeforeTest
    public void setUp(){
        String dir = System.getProperty("user.dir"); // ruta del proyecto
        String driverUrl = "/drivers/chromedriver.exe";
        String url = dir + driverUrl;
        System.setProperty("webdriver.chrome.driver", url);


//        //Now you can Initialize marionette driver to launch firefox
//        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//        capabilities.setCapability("marionette", true);
//        WebDriver driver = new MarionetteDriver(capabilities);
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        util = new Utility(driver);
    }

    @AfterTest
    public void close(){
        driver.close();
    }
}