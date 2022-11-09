package loantester.Bai8_CheckBoxRadioDropdown;

import loantester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdownListStatic extends BaseTest {
    public static void main(String[] args) {


        creatDriver();

        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

        WebElement selectElement = driver.findElement(By.xpath("//select[@id='select-demo']"));

        //khởi tạo đối tượng select và giá trị là một WebElement của thẻ select HTML
        Select select = new Select(selectElement);

        System.out.println(select.getFirstSelectedOption().getText());
        System.out.println("Kiểm tra kiểu của select: " +select.isMultiple());
        System.out.println("Kiểm tra số lượng option trong select: " +select.getOptions().size());

        //Get option với các hàm hỗ trợ của class select
        select.selectByVisibleText("Wednesday");
        sleep(1);
        System.out.println(select.getFirstSelectedOption().getText());

        select.selectByValue("Monday");
        sleep(1);
        System.out.println(select.getFirstSelectedOption().getText());

        select.selectByIndex(6);
        sleep(1);
        System.out.println(select.getFirstSelectedOption().getText());


        closeDriver();
    }
}