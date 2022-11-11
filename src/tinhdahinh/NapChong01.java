package tinhdahinh;

public class NapChong01 {
    public int tinhtong(int a, int b){
        return a+b;
    }
    public int tinhtong(int a, int b, int c){
        return a+b+c;
    }
    public int add(int a1, int b1){
        return a1+b1;
    }
    public double add(double a1, double b1){
        return a1+b1;
    }



    public static void main(String[] args) {
        NapChong01 nc1 = new NapChong01();
        System.out.println(nc1.tinhtong(2,4));
        System.out.println(nc1.tinhtong(2,4,5));
        System.out.println(nc1.add(2,4.0));
    }
}
