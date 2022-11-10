package mangmotchieu;

public class MangNacDanh {
    public static void main(String[] args) {
        // khai báo mảng nặc danh - không đầy đủ thông tin mảng (độ dài cụ thể, không cần nạp theo ví trí cụ thể0

        String menu[] = {"Mai","Link","Hoài","Tâm","Mạnh"};
        //Duyệt mảng nặc danh
        for (String name : menu){
            System.out.println(name);
        }

    }
}
