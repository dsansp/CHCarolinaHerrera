package pageObject.componentes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.elementos.ElementsHeader;
import pageObject.utiles.BaseTest;

public class Header extends ElementsHeader {

@Test(groups = {"Menu"}, enabled = true)
    void menuPresente() {
    driver.get(url);
    WebElement header = driver.findElement(By.cssSelector("#header"));
    Assert.assertTrue(header.isDisplayed());
    WebElement chLogo = driver.findElement(By.cssSelector("h1#logo>a>img"));
    Assert.assertTrue(chLogo.isDisplayed());
}
}
