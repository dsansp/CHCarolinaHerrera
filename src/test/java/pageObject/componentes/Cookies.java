package pageObject.componentes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.elementos.ElementsCookies;


public class Cookies extends ElementsCookies {

@Test(groups = {"Cookies"}, enabled = true)
    void cookiesDisplayed() {
    driver.get(url);
    driver.manage().deleteAllCookies();
    driver.navigate().refresh();
    cookies= driver.findElement(By.cssSelector(idCookies));
    Assert.assertTrue(cookies.isDisplayed());

}

    @Test(groups = {"Cookies"},dependsOnMethods = {"cookiesDisplayed"},enabled = true)
    void cookiesAcept() {

        String acepto = driver.findElement(By.cssSelector(idLabelAcepto)).getText();
        Assert.assertEquals(acepto,expAcept);
        driver.findElement(By.id(idAcceptCookie)).click();
        driver.navigate().refresh();

    }

    @Test(groups = {"Cookies"},dependsOnMethods = {"cookiesAcept"},enabled = true)
    void cookiesReload() {

        cookies= driver.findElement(By.cssSelector(idCookies));
        Assert.assertFalse(cookies.isDisplayed());

    }
}
