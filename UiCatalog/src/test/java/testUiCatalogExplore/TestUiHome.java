package testUiCatalogExplore;

import org.testng.annotations.Test;
import reporting.TestLogger;
import uiCatalogExplore.UiHome;

public class TestUiHome extends UiHome {
    @Test
    public void test1(){
        TestLogger.log("app is launched ...");
        clickBtns();
        System.out.println("btns clicked ...");
    }
}
