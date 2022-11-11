package baitap02OOP.person;

public class Person {
    public static String name;
    public static int age;
    public static String gender;
    public static String address;
    public static String phone;

    // hàm GET

    public static String getName() {
        return name;
    }

    public static int getAge() {
        return age;
    }

    public static String getGender() {
        return gender;
    }

    public static String getAddress() {
        return address;
    }
    public static String getPhone() {
        return phone;
    }

    // HÀM SET

    public static void setName(String name) {
        Person.name = name;
    }

    public static void setAge(int age) {
        Person.age = age;
    }

    public static void setGender(String gender) {
        Person.gender = gender;
    }

    public static void setAddress(String address) {
        Person.address = address;
    }

    public static void setPhone(String phone) {
        Person.phone = phone;
    }

    // Hàm xây dựng không có tham số

    public Person() {
        name = "John";
        age = 22;
        gender = "Nữ";
        address = "HNOI";
        phone = "090990";
    }

    public void getInfor(){
        System.out.println("Name:" +name);
        System.out.println("age" +age);
        System.out.println("gender:" +gender);
        System.out.println("address:" +address);
        System.out.println("phone:" +phone);
    }
    // hàm xây dựng có tham số

    public Person(String name, int age, String gender, String address, String phone){
        this.name = name;
        this.age = age;
        this.gender=gender;
        this.address = address;
        this.phone = phone;
    }
}
