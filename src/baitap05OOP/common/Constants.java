package baitap05OOP.common;

public class Constants {

        private static String browser = "Chrome";
        private static boolean report = true;
        private static boolean headless = false;

        public Constants() {
        }

        public Constants(String browser, boolean report, boolean headless) {
            this.browser = browser;
            this.report = report;
            this.headless = headless;
        }

        //tính đóng gói
        public static String getBrowser() {
            return browser;
        }

        public void setBrowser(String browser) {
            this.browser = browser;
        }

        public boolean isReport() {
            return report;
        }

        public void setReport(boolean report) {
            this.report = report;
        }

        public static boolean isHeadless() {
            return headless;
        }

        public void setHeadless(boolean headless) {
            this.headless = headless;
        }




}
