package loantester.Bai7_WebDriver;

import org.openqa.selenium.Cookie;
import loantester.common.BaseTest;

import java.util.Set;

public class InterfaceOptions extends BaseTest {
    public static void main(String[] args) {
        creatDriver();

        // Add a new cookie
        Cookie newCookie = new Cookie("customName", "customValue");
        driver.manage().addCookie(newCookie);

        System.out.println( driver.manage().getCookieNamed("customNam"));

// Get all cookies
        Set<Cookie> cookies = driver.manage().getCookies();

// Delete a cookie by name
        driver.manage().deleteCookieNamed("CookieName");

// Delete all cookies
        driver.manage().deleteAllCookies();
        closeDriver();
   }
}
