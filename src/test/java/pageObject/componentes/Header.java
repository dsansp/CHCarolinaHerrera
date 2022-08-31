package pageObject.componentes;

import org.testng.annotations.Test;

import pageObject.elementos.ElementsHeader;
import pageObject.utiles.BaseTest;

public class Header extends ElementsHeader {

@Test(groups = {"Menu"}, enabled = true)
    void menuPresente() {
    driver.get(url);

}
}
