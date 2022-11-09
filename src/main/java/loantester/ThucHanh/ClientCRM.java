package loantester.ThucHanh;

import loantester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class ClientCRM extends BaseTest {

    //login to CRM system
    public static void signinCRM() {
        driver.get("https://rise.fairsketch.com/signin");
        driver.findElement(By.xpath("//input[@id='email']")).clear();
        driver.findElement(By.xpath("//input[@id='password']")).clear();
        sleep(1);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@demo.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("riseDemo");
        driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();

    }

    //Open Client page
    public static void opeiennCltPage(){
        sleep(2);
        driver.findElement(By.xpath("//span[normalize-space()='Clients']")).click();
        sleep(2);
        driver.findElement(By.xpath("//div[@id='page-content']//a[normalize-space()='Clients']")).click();
        sleep(1);
        driver.findElement(By.xpath("//div[@class='title-button-group']//a[@title='Add client']")).click();

    }
     //Enter data on Add Client dialog
     public static void enterDataAddClient() {
        driver.findElement(By.xpath("//a[normalize-space()='Add client']"));
        sleep(2);
        driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("MaiLoan");
         driver.findElement(By.xpath("//div[@id='s2id_created_by']")).click();
         sleep(1);
         driver.findElement(By.xpath("//div[@id='select2-drop']//input")).sendKeys("Mark Thomas", Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("Autotest");
         driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Hanoi");
         driver.findElement(By.xpath("//input[@id='state']")).sendKeys("092032");


         //Cuộn chuột đến element Label ở cuối để thấy được các element bị che
         JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("arguments[0].scrollIntoView(false);", driver.findElement(By.xpath("//label[normalize-space()='Disable online payment']")));

         driver.findElement(By.xpath("//input[@id='zip']")).sendKeys("29y222");
         driver.findElement(By.id("country")).sendKeys("cầu giấy");
         driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("0920390232");
         driver.findElement(By.xpath("//input[@id='website']")).sendKeys("https://rise.fairsketch.com/clients");
         driver.findElement(By.xpath("//input[@id='vat_number']")).sendKeys("0965");
         driver.findElement(By.xpath("//div[@id='s2id_group_ids']")).click();
         driver.findElement(By.xpath("//div[@id='s2id_group_ids']//input")).sendKeys("VIP",Keys.ENTER);

         sleep(1);
         driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
     }

    public static void main(String[] args) {
        creatDriver();


        signinCRM();
        opeiennCltPage();
        enterDataAddClient();

        closeDriver();
    }
}
