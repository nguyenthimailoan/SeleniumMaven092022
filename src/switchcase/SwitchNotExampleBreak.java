package switchcase;

public class SwitchNotExampleBreak {
    public static void main(String[] args) {
        int number = 20;
        switch (number){
            case 10:
                System.out.println("10");
            case 20:
                System.out.println("20");
            case 5:
                System.out.println("5");
            default:
                System.out.println("not in 10,20 or 30");


        }
    }
}
