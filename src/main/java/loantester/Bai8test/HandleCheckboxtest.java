package loantester.Bai8_CheckBoxRadioDropdown;

import loantester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleCheckboxtest extends BaseTest {
    public static void main(String[] args) {
       creatDriver();
       
       // vào trang web
        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
        WebElement checkbox = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        boolean checkboxbefore = checkbox.isSelected();
        System.out.println("Kiểm tra trạng thái mặc định:" +checkboxbefore);

        // Nếu chưa click thì click vào checkbox
        if(checkboxbefore == false){
            checkbox.click();
        }

        //Kiểm tra lại kết quả đã chọn đúng chưa
        boolean checkboxafter = checkbox.isSelected();
        System.out.println("Kiểm tra trạng thái sau khi đã chọn:" +checkboxafter);

        WebElement message = driver.findElement(By.xpath("//div[@id='txtAge']"));
        System.out.println(message.isDisplayed());
        System.out.println(message.getText());
       
       
       closeDriver();



        
    }
}

