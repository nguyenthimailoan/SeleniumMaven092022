package mangmotchieu;

public class Mang {
    public static void main(String[] args) {
        int  mang1[] = new int [10]; // khai báo và khởi tạo mảng
        //Gán giá trị cho phần tử trong mảng
        mang1[0] = 4;
        mang1[1] = 5;
        mang1[2] = 34;
        mang1[3] = 35;
        mang1[4] = 90;

        System.out.println(mang1[2]);

        //Duyệt phần tử trong mảng
        // Dùng vòng lặp for  for cải tiến

//        for (int a : mang1){
//            System.out.println(a);
//        }

        String menu[] = new String [20];

        // Nạp giá trị CHUỖI trong mảng
        for(int i=0;i<menu.length; i++){
            menu[i] = "home";
        }
        System.out.println(menu[5]);
    }
}
