/*package pageObject.utiles;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;


import java.net.MalformedURLException;
import java.net.URL;

public class RemoteBaseTest {

    public WebDriver driver;

    public Utility util;

//host
static final String HOST_URL = "http://localhost:4444/wd/hub";

        @BeforeClass
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    // Navegador
//        WebDriver driver;
    @BeforeTest
    public void setUp() throws MalformedURLException {
        String dir = System.getProperty("user.dir"); // ruta del proyecto
        String driverUrl = "./drivers/chromedriver.exe";
        String url = dir + driverUrl;
        System.setProperty("webdriver.chrome.driver", url);

        ChromeOptions options = new ChromeOptions();



        try {
            driver = new RemoteWebDriver(new URL(HOST_URL), options);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
      //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(url);
        driver.manage().window().maximize();

        util = new Utility(driver);
    }

    @AfterTest
    public void close(){
        driver.quit();
    }


}
*/

