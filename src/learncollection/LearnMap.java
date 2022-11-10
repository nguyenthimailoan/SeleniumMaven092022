package learncollection;
import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {
        Map<String,String> hashmap = new HashMap<String,String>();


        hashmap.put("Windows","2000");
        hashmap.put("Windows" , "XP");
        hashmap.put("Language2","java");
        hashmap.put("Language1","XP");
        hashmap.put("Language3", "XP"); // Map không thể chứa key trùng lặp . nếu trùng thì lấy key ở cuối cùng

        System.out.println("Các phần tử của Map");
        System.out.println("\t" +hashmap);
    }
}
