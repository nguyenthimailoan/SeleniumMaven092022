package loantester.Bai5_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginECommerce {
    public static void main(String[] args) throws InterruptedException {

        //Khởi tạo browser với Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Mở trang ECommerce
        driver.get("https://demo.activeitzone.com/ecommerce/login");
        Thread.sleep(1000);

        // Điền email
        driver.findElement(By.id("email")).sendKeys("admin@example.com");
        Thread.sleep(2000);

        // Điền Password - Tìm localtor theo ID với By.id()
        driver.findElement(By.name("password")).sendKeys("123456");
        Thread.sleep(2000);

        // Click link Forgot password ? - By.link text()
        driver.findElement(By.linkText("Forgot password ?")).click();
        Thread.sleep(2000);







//        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/form/button")).click();
//        Thread.sleep(2000);
//
//        driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/ul[2]/li[6]/a")).click();
//        Thread.sleep(2000);

        //Tắt browser
        driver.quit();
    }

}
