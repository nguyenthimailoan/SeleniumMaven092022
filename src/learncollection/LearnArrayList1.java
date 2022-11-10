package learncollection;
import java.util.*;
import java.util.Map;

public class LearnArrayList1 {
    public static void main(String[] args) {

        List<String> listmenu = new ArrayList<>();
        listmenu.add("Home");
        listmenu.add("Client");
        listmenu.add("Shash");

        System.out.println(listmenu);

        System.out.println("-----------------");
        for (int i = 0; i < listmenu.size(); i++) {
            System.out.println(listmenu.get(i));
        }
        System.out.println("---------------------");

        // foreach
        for (String obj : listmenu) {
            System.out.println(obj);
        }
        // Iterator
        Iterator<String> iterator = listmenu.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }

        // MAP
        Map <String , String> mapmenu = new HashMap<String,String>();
        mapmenu.put("Window","XP");
        mapmenu.put("Window","2000");
        mapmenu.put("language1","Java");
        mapmenu.put("language2","PHP");

        for(int i = 0;i<mapmenu.size(); i++){
            System.out.println(mapmenu.get(i));
        }



    }
}
