package baitap02OOP.person;


import org.w3c.dom.ls.LSOutput;

public class Information {
    public static void main(String[] args) {
        Person p1 = new Person("LOAN",23,"Nữ","HN","09090");
        System.out.println(p1.getName());
        System.out.println(p1.getAge());

        Person p2 = new Person();
//        p2.setAge(20);
//        p2.setName("John");
//        p2.setGender("Nữ");
//        p2.setAddress("SG");
//        p2.setPhone("090909");

//        System.out.println(p2.getName());
        p2.getInfor();
    }

}
