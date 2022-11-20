package loantester.com.Baitap1;

import loantester.com.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class AddCategory extends BaseTest {

    public static void LoginEcommerce() throws InterruptedException {
        driver.get("https://demo.activeitzone.com/ecommerce/login");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        Thread.sleep(2000);
    }

    public static void oppenProductstPage() throws InterruptedException {
        driver.findElement(By.xpath("//span[normalize-space()='Products']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Category']")).click();
        Thread.sleep(2000);
    }
    public static void addNewCategory() throws InterruptedException {
        driver.findElement(By.xpath("//span[normalize-space()='Add New category']")).click();
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Alan Walker");
        driver.findElement(By.xpath("//button[@title='No Parent']")).click();
       driver.findElement(By.xpath("//div[@class='dropdown-menu show']//input[@class='form-control']")).sendKeys("Women Clothing & Fashion", Keys.ENTER);
       Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='order_level']")).sendKeys("88833");
        driver.findElement(By.xpath("//button[@title='Physical']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Digital']")).click();
        Thread.sleep(2000);

        //trường banner
    //    driver.findElement(By.xpath("(//div[@class='form-control file-amount'])[1]")).click();
    //    driver.findElement(By.xpath("//div[@class='aiz-uploader-search text-right']//input")).sendKeys("beauty");
    //    driver.findElement(By.xpath("(//div[@class='card-file-thumb']//img)[1]")).click();
    //    driver.findElement(By.xpath("//button[normalize-space()='Add Files']")).click();

        //trường icon
        driver.findElement(By.xpath("//div[normalize-space()='Choose file']")).click();
        driver.findElement(By.xpath("//input[@class='form-control form-control-xs']")).sendKeys("CAR",Keys.ENTER);
        driver.findElement(By.xpath("(//div[@class='card-file-thumb'])[1]")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Add Files']")).click();
     //   driver.findElement(By.xpath("")).click();




    }

    public static void main(String[] args) throws InterruptedException {
        creatDriver();
        LoginEcommerce();
        oppenProductstPage();
        addNewCategory();


        closeDriver();
    }
}
