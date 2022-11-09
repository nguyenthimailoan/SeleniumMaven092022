package loantester.Bai6_WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginCMS {
    public static void main(String[] args) throws InterruptedException {
        //Khởi tạo browser với Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Login CMSr
        driver.get("https://demo.activeitzone.com/ecommerce/login");

        //Bắt Web Element Email(object)
        WebElement inputEmail = driver.findElement(By.id("email"));
        inputEmail.sendKeys("admin@example.com");

        System.out.println("Lấy Text của ô Email: " + inputEmail.getText());
        System.out.println("Name ô Email: " + inputEmail.getAttribute("name"));
        System.out.println("Class ô Email: " + inputEmail.getAttribute("class"));

        WebElement inputPassword = driver.findElement(By.id("password"));
        inputPassword.sendKeys("123456");
        Thread.sleep(3000);
      //  inputEmail.clear();

        // Bắt Element isSelect

        WebElement checkboxRemember1 = driver.findElement(By.id("remember"));
        System.out.println("Đã chọn: " + checkboxRemember1.isSelected());

        driver.findElement(By.xpath("//span[normalize-space()='Remember Me']")).click();
        Thread.sleep(1000);
    //    WebElement checkboxRemember2 = driver.findElement(By.id("remember"));
    //    System.out.println("Đã chọn: " + checkboxRemember1.isSelected());

        //Get Text của tiêu đề H1
        WebElement tieude = driver.findElement(By.xpath("//div[@class='card-body']//h1"));
        System.out.println(tieude.getText());



        //Bắt Element coppy
        WebElement buttonCoppy = driver.findElement(By.xpath("//button[text()='Copy']"));
        System.out.println("Trạng thái nút Coppy:" +buttonCoppy.isDisplayed());
        if(buttonCoppy.isDisplayed()==true){
            driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        }

        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block']")).click();
        Thread.sleep(3000);

 //       WebElement tieude = driver.findElement(By.xpath("(//div[@class='col-md-6']//h6)[1]"));
//        System.out.println(tieude.getText());





        // Tắt browser
        driver.quit();
    }


}
