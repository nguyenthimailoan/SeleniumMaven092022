package loantester;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;


public class Selenium {
    public static void main(String[] args) throws InterruptedException {

        //Khởi tạo browser với Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Mở trang anhtester.com
        driver.get("https://anhtester.com/");

        //Click nút Login
        driver.findElement(By.xpath("/html/body/section[1]/div/div[1]/div/div[2]/div/div/div[1]/div/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[1]/div/div/div/div[1]/div/div[2]/h2/a")).click();

        Thread.sleep(2000);



        //Tắt browser
        driver.quit();
    }

}
