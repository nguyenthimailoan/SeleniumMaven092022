package javaoop;

import org.w3c.dom.ls.LSOutput;

public class ThongTin {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien();
        System.out.println(nv1.getName());

        NhanVien nv2 = new NhanVien("HỒNG DIỄM",33,"Nữ","Hànoi");
        System.out.println(nv2.getName());
        System.out.println(nv2.getAge());
        System.out.println(nv2.getGender());
        System.out.println(nv2.getAddress());

    }

}
