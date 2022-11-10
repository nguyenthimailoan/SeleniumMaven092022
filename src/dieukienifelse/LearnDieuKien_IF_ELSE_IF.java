package dieukienifelse;

public class LearnDieuKien_IF_ELSE_IF {
    public static void main(String[] args) {
        int DTB = 8;

        if(DTB>8){
            System.out.println("xuất sắc");
        } else if (DTB ==8){
            System.out.println("Gioi");
        } else if (DTB <8 && DTB >=7) {
            System.out.println("Khá");
        } else if (DTB <7 && DTB >=5){
            System.out.println("Trung bình");
        }
        else {
            System.out.println("Yếu");
        }

        // Automation Test

//        String message = "Lấy từ website";
//        if(message == "Plase fill value"){
//            System.out.println("Chưa điền email");
//        }else if(message =="Please include in @..."){
//            Log.fail("format email chưa dùng");
//        }else if (message == "Please enter a part following @..."){
//            Assert.assertFail("");
//            Log.fail("format email chưa dùng");
//        }else{
//            Log.info("Điền email thành công");
//        }
//       Assert

    }
}
