package bien;

public class LearnVariable {

    public String name  = "Loantester";  // biến toàn cục

    public static String name1 = "Đăng khoa"; // Biến static
    public static int age  = 20;

    public  void Infor (){
        System.out.println(name);

    }
    public static void getInfor(){
        System.out.println(name1);
        System.out.println(age);
    }

    public void sayhello(){
        int n = 10;  // đây là biến local
        System.out.println(n);
    }

    public static void main(String[] args) {
        LearnVariable obj = new LearnVariable();
        obj.sayhello();
        obj.Infor();
    }
}

//    BIẾN LOCAL :
//        - Nằm trong hàm
//        - Không dùng phạm vi truy cập ( public,private ,protected)
//        - không được gọi sang các hàm khác
//
//        BIẾN TOÀN CỤC:
//        - Nằm ngoài hàm. mà trong Class
//        - Dùng được ở nhiều hàm khác nhau
//        - Dùng được phạm vi truy cập ( public,private ,protected)
//        - Có thể gọi tên trực tiếp vào các hàm - trừ hàm "main" (trừ hàm có trạng thái static)
//        - Gọi lại thông qua ĐỐI TƯỢNG TÊN CLASS (obj.tenbien)
//
//
//        BIẾN STATIC
//        - Nằm ngoài hàm. mà trong Class
//        - Dùng được ở nhiều hàm khác nhau
//        - Dùng được phạm vi truy cập ( public,private ,protected)
//        - Có thể gọi tên trực tiếp vào các hàm
//        - gọi biến/ hàm static thoogn qua tên class : SinhVien.name
//        - Gọi lại thông qua ĐỐI TƯỢNG TÊN CLASS  (obj.tenbien)
//
//        ĐẶT TÊN BIẾN :
//        - Cùng vị trí (local/instance) thì không được trùng nhau
//        - khác vị trí thì được trùng: vd biến toàn cục trùng biến local được
//        - Biến toàn cục và biến vừa toàn cục vừa static không được trùng nhau


