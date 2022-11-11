package baitap05OOP.common;

public class BaseTest {
    Constants info = new Constants();

    protected void setupDriver(String browser, boolean isReport, boolean isHeadless) {
        info.setBrowser(browser);
        info.setReport(isReport);
        info.setHeadless(isHeadless);
    }

    protected void createDriver() {
        System.out.println("Opening browser: " + info.getBrowser());
        System.out.println("Create report: " + info.isReport());
        if (info.isHeadless() == true) {
            System.out.println("This is headless website");
        } else {
            System.out.println("This is NOT headless website");
        }
    }

    protected void closeDriver() {
        System.out.println("Closed browser " + info.getBrowser());
    }
}

