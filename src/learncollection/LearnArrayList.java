package learncollection;

import com.sun.jdi.ArrayReference;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;


public class LearnArrayList {
        // Thuộc Interface List
        public static void main (String[] args){
            // khai báo và khởi tạo đối tượng ArrayList
            List<String> listMenu = new ArrayList<String>(); // cách 1
            //ArrayList <String> listMenu = new ArrayList<String>(); // cách 2
            // Thêm phần tử vào bộ ArrayList
            listMenu.add ("Home");
            listMenu.add ("Client");
            listMenu.add ("Selenium");
            listMenu.add ("Task");
            listMenu.add ("ZAOO");
            listMenu.add ("Home");

            //truy cập phần từ chỉ số 3 của listMenu
            System.out.println("Truy cập phần từ:");
            System.out.println(listMenu.get(3));
            System.out.println("--------------------");

            // cập nhật số phân tử set(index,element)
            System.out.println("Cập nhật số phần tử :");
            System.out.println(listMenu.set(2,"FaceBook"));

            // phương thức remove ()
            // phương thức clear () : // xóa tất cả
            listMenu.remove("ZAOO");
            System.out.println("Số phần tử của index sau khi remove" +listMenu);
            System.out.println("số phần tử sau khi remove " +listMenu.size());

            // tìm kiếm 1 phần tử ArrayList (nếu kq đúng ->true, sai ->false)
            // phương thức : contains("");
            System.out.println("Kiểm tra có tồn tại trong listMenu hay không");
            System.out.println(listMenu.contains("kkkk"));

//            listMenu.remove(2);
//            listMenu.add("1,ba");

            // Tính độ dài của arraylist dùng hàm size()
            System.out.println("Độ dài Arraylisst: " +listMenu.size());

            //xóa 1 phần tử
            listMenu.remove(3);

            listMenu.set(1,"home");

            // lấy giá trị phần tử - Dùng for, foreach,interato
            for(int i = 0;i<listMenu.size();i++){
               System.out.println(listMenu.get(i));
          }
            System.out.println("");
            System.out.println("------------------------");
            // foreach
            for(String obj : listMenu){
                System.out.println(obj);
            }
            System.out.println("");
            System.out.println("-----------------------");

            //iterator
            Iterator <String> interator = listMenu.listIterator();
            while(interator.hasNext()){
                System.out.println(interator.next() +"");
            }

            // coppy phần tử của list 1 sang list 2
            // List1 : listMneu
            //List2 :tempMenu

            ArrayList<String> tempMenu = new ArrayList<String>();
            tempMenu.addAll(listMenu);

            System.out.println("Ví dụ sử dụng phương thức addAll  ");
            System.out.println("------------------------");

            for(String obj :tempMenu){
                System.out.println(obj);
            }

            // RetainALl
            ArrayList<String> retainall = new ArrayList<String>();
            retainall.retainAll(listMenu);

            System.out.println("Ví dự sử dụng phương thức Retainall");
            System.out.println("----------------------");
            for(String obj :retainall){
                System.out.println(obj);
            }

            // RemoveAll
            ArrayList<String> remove = new ArrayList <String>();
            remove.removeAll(listMenu);

            System.out.println("Ví dụ remove ");
            for(String obj :remove){
                System.out.println(obj);
            }



        }




}
