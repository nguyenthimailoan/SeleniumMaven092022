package loantester.Bai7_WebDriver;

import loantester.common.BaseTest;
import org.openqa.selenium.By;

public class BasicBrowser extends BaseTest {
    public static void main(String[] args) {
        creatDriver();
        driver.navigate().to("http://anhtester.com");
        sleep(3);
        driver.findElement(By.id("btn-login")).click();

        // Điều hướng về lịch sử trang trước đó
     //   driver.navigate().back();

        // Làm mới trang hiện tại
    //    driver.navigate().refresh();

        // Điều hướng đến trang tiếp sau
    //    driver.navigate().forward();

        // Get the title of the page
        System.out.println(driver.getTitle());
        // Get the current URL
        System.out.println(driver.getCurrentUrl());
        // Get the current page HTML source
        System.out.println( driver.getPageSource());


        closeDriver();
    }
}
