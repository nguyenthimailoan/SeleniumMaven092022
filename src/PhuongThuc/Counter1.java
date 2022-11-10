package PhuongThuc;

public class Counter1 {

     static  int count = 0; // sẽ lấy bộ nhớ khi instance được tạo ra

        Counter1() {
            count++;
            System.out.println(count);
        }

        public static void main(String args[]) {


            //khởi tạo class 3 lần
            Counter1 c1 = new Counter1();
            Counter1 c2 = new Counter1();
            Counter1 c3 = new Counter1();

        }

}
