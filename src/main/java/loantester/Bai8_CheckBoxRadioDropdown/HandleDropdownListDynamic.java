package loantester.Bai8_CheckBoxRadioDropdown;

import loantester.common.BaseTest;
import org.openqa.selenium.By;

public class HandleDropdownListDynamic extends BaseTest {
    public static void main(String[] args) {
        creatDriver();

        driver.get("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
        sleep(2);

        //click vào dropdown Category
        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']")).click();

        //search giá trị cần chọn
        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']/parent::a/following-sibling::div//input")).sendKeys("Hotels");

        //click chọn text đã search (cần chọn)
        driver.findElement(By.xpath("")).click();


        closeDriver();
    }
}
