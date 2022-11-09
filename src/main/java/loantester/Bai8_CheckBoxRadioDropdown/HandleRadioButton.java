package loantester.Bai8_CheckBoxRadioDropdown;

import loantester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleRadioButton extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        creatDriver();
        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
        WebElement radioButton = driver.findElement(By.xpath("//div[normalize-space()='Group Radio Buttons Demo']/following-sibling::div//label[normalize-space()='Male']/input"));
        System.out.println(radioButton.isSelected());

        Thread.sleep(3000);
        if(radioButton.isSelected() ==false){
            radioButton.click();
        }
        System.out.println(radioButton.isSelected());

        sleep(1);

        WebElement radioButtonGroup = driver.findElement(By.xpath("//h4[normalize-space()='Age Group :']/following-sibling::label[normalize-space()='0 to 5']"));
        radioButtonGroup.click();
        System.out.println("Trạng thái radio Group:" +radioButtonGroup.isSelected());
        closeDriver();
    }

}
