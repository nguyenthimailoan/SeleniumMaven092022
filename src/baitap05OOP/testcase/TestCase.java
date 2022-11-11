package baitap05OOP.testcase;
import baitap05OOP.common.BaseTest;

public class TestCase extends BaseTest {
    private static void login() {
        System.out.println("Steps:");
        System.out.println("\t" + "Step 1: Open url https://demo.activeitzone.com/ecommerce/login");
        System.out.println("\t" + "Step 2: Input email admin@example.com into email field");
        System.out.println("\t" + "Step 3:Input password 123456 into password field");
        System.out.println("\t" + "Step 4:Press Login button to login");
        System.out.println("\t" + "Step 5:Verify that Dashboard page is displayed");
    }

    private static void addCategory() {
        System.out.println("Steps:");
        System.out.println("\t" + "Pre condition: User logged in successfully");
        System.out.println("\t" + "Step 1: Clicks on Products menu on left sidebar ");
        System.out.println("\t" + "Step 2: Clicks on Category submenu");
        System.out.println("\t" + "Step 3:Clicks on Add New Category button");
        System.out.println("\t" + "Step 4:Input 'New Category OOP' into Name field");
        System.out.println("\t" + "Step 5:Input '1' into Ordering Number field");
        System.out.println("\t" + "Step 6: Click on Save button");
        System.out.println("\t" + "Step 7: Verify that Category page is displayed and new category is created");
    }

    public static void main(String[] args) {
        TestCase testcase = new TestCase();
        testcase.setupDriver("Firefox", false, true); // tính kế thừa, TestCase kế thừa BaseTest nên khởi tạo 1 phần từ TestCase nhưng lại có thể gọi hàm của BaseTest

        System.out.println("------Test case LOGIN------");
        testcase.createDriver();
        testcase.login();
        testcase.closeDriver();

        testcase.setupDriver("Firefox", true, false); //optional
        System.out.println("\n" + "------Test case ADD CATEGORY------");
        testcase.createDriver();
        testcase.addCategory();
        testcase.closeDriver();
    }
}
