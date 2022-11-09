package loantester.Bai6_WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CheckElementEnable {
    public static void main(String[] args) {
        //Khởi tạo browser với Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //bắt enable
        driver.get("https://www.dofactory.com/html/button/disabled");
        WebElement buttonClickme = driver.findElement(By.xpath("//button[text()='Click Me']"));
        System.out.println(buttonClickme.isEnabled());
        WebElement buttonClickTRY = driver.findElement(By.xpath("(//button[normalize-space()='Try it live'])[1]"));
        System.out.println(buttonClickTRY.isEnabled());


        //tắt browser
        driver.quit();
    }
}
