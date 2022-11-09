package loantester.Bai7_WebDriver;

import loantester.common.BaseTest;
import org.openqa.selenium.WindowType;

public class AdvanceBrowser extends BaseTest {
    public static void main(String[] args) {
        creatDriver();
        driver.get("https://anhtester.com/");

        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("http://google.com/");

        sleep(2);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://anhtester.com/blog");

        closeDriver();
    }
}
