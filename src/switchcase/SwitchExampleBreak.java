package switchcase;

public class SwitchExampleBreak {
    public static void main(String[] args) {
        int number =10;
        switch (number){
            case 10:
                System.out.println("10");
                int a = 4;
                int b =5;
                System.out.println(a+b);
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            case 40:
                System.out.println("40");
                break;
            default:
                System.out.println("Not in 10.20 or 30");

        }
    }

}
