package PhuongThuc;



public class LearnMethod {
    //  <modifier> void methodName(Danh sách các tham số){
    // code
    //  }
    public void showInfor() {
        System.out.println("Mailoan");

    }

    private static String getName() {
        String name = "loan tester";
        return name;
    }

    protected void displayInfo(String name,int age){

        System.out.println(name);
        System.out.println(age);
    }


    public int cong2so(int a,int b){
       return a + b;  // cách 1

    }



    public static void main(String[] args) {
        // tạo đối tượng thay mặt cho class để gọi lại tất cả các hàm trong class
        LearnMethod obj = new LearnMethod();

        obj.showInfor();   // thông qua class

       System.out.println(getName());   // phải có static

        obj.displayInfo("Phong",20);
        obj.displayInfo("Hoa",27);
       System.out.println (obj.cong2so(100,100));
        System.out.println(Student.college);  // class.bien mang được nhiều nơi


    }


}