package dieukienifelse;

public class LearnDieuKienIFElse {
    public static void main(String[] args) {
        int age = 30;
        String name = "Selenium";

//        if(age >30){
//            System.out.println("Tuổi lớn hơn 30");
//        }
//        else{
//            System.out.println("Tuổi nhỏ hơn 30");
//        }

        // kết hợp nhiều điều kiện

        if(age >30 && name=="Selenium"){
            System.out.println("Pass. Tuổi lớn hơn 30");
        }
        else{
            System.out.println("Fail. Tuổi nhỏ hơn 30");
        }
    }

}
