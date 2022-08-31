/*package pageObject.utiles;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Set;

import static org.testng.AssertJUnit.assertTrue;


public class UtilidadesRemote {

    static WebDriver driver;

    public UtilidadesRemote(WebDriver remoteDriver) {
        driver = remoteDriver;
    }

    public boolean getTitle(String titleText) {
        String title = driver.getTitle();
        boolean findText = title.contains(titleText);
        return findText;
    }

    public boolean getUrl(String urlLoginExpected) {
        String Url = driver.getCurrentUrl();
        boolean findUrl = Url.contains(urlLoginExpected);
        return findUrl;
    }

    public static void InicioCookies(String url) {
        driver.get(url);
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();

    }

    public static int getResponseCode(String url) throws IOException {
        URL urlObj = new URL(url);
        HttpURLConnection httpCon = (HttpURLConnection) urlObj.openConnection();
        int responseCode = httpCon.getResponseCode();
        System.out.println(" HTTP Server response code: " + responseCode);
        if (responseCode != HttpURLConnection.HTTP_OK) {
            System.out.println("Server returned response code " + responseCode + ". connection failed.");
            System.exit(0);
        }
        return responseCode;
    }


        public static void capturescreen(WebDriver driver, String screenShotName, String status) {
            try {
                TakesScreenshot takesScreenshot = (TakesScreenshot) driver;

                File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

                if (status.equals("FAILURE")) {
                    FileUtils.copyFile(scrFile, new File("./ScreenshotsFailure/" + screenShotName + ".png"));
                } else if (status.equals("SUCCESS")) {
                    FileUtils.copyFile(scrFile, new File("./ScreenshotsSuccess/" + screenShotName + ".png"));
                }


                System.out.println("Printing screen shot taken for className " + screenShotName);

            } catch (Exception e) {
                System.out.println("Exception while taking screenshot " + e.getMessage());
            }

    }

    public static void cookiesAccept(){

        WebElement acceptar = driver.findElement(By.id("cookies-accepted"));
        assertTrue(acceptar.isDisplayed());
        acceptar.click();
    }

    public static void WindowChange() {
        String parent = driver.getWindowHandle();
        Set<String> numberOfWindows = driver.getWindowHandles();
        Iterator<String> I1 = numberOfWindows.iterator();
        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
            }
        }
    }
    public static void closeTabs() {
        String originalHandle = driver.getWindowHandle();
        for(String handle : driver.getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                driver.switchTo().window(handle);
                driver.close();
            }
        }

        driver.switchTo().window(originalHandle);
    }
}
*/
