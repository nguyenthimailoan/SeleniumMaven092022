package javaoop;

public class NhanVien {
    private String name;
    private int age;
    private String address;
    private String gender;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public NhanVien() {
        name = "Hồng Loan";
        age = 23;
        gender = "male";
        address = "HNOI";
    }

    public void Infor(){
        System.out.println("name:" +name);
        System.out.println("age" +age);
        System.out.println("gender" +gender);
        System.out.println("address" +address);
    }
    public NhanVien(String name, int age, String gender, String address){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public void setName() {
    }
}
