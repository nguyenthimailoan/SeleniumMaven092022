package learncollection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args) {
        // creat hashset
        Set<String> set = new HashSet<String>();

        // add Object to hashset
        set.add("Java");
        set.add("C++");
        set.add("PHP");
        set.add("Java");

        // foreach
        for(String obj: set){
            System.out.println(obj);
        }


    }



}
