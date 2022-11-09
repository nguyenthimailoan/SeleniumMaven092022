package loantester.Bai8_CheckBoxRadioDropdown;

import loantester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleCheckbox extends BaseTest {
    public static void main(String[] args) {
        creatDriver();

        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

        //kiểm tra checkbox mặc định
        WebElement checkboxone = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        boolean checkboxStatusBefore = checkboxone.isSelected();
        System.out.println(checkboxStatusBefore);

        //Nếu mà check chưa chọn (false) thì click chọn checkbox
        if(checkboxStatusBefore == false){
            checkboxone.click();
        }

        //Kiểm tra lại kết quả sau khi click chọn
        sleep(1);
        boolean checkboxStatusAfter = checkboxone.isSelected();
        System.out.println("Trạng thái checkbox sau khi chọn: " +checkboxStatusAfter);

        //Kiểm tra thông báo liên quan với kết quả khi đã chọn
        sleep(1);
        WebElement message = driver.findElement(By.xpath("//div[@id='txtAge']"));
        System.out.println("Trang thái message: " +message.isDisplayed());
        System.out.println(message.getText());
        sleep(1);





        closeDriver();
    }
}

