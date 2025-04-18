package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) throws Exception {

        Set<String> set = new HashSet<>();
        //Set<String> set = new TreeSet<>();
        //Set<String> set = new LinkedHashSet<>();

        set.add("Tv");
        set.add("Notebook");
        set.add("Tablet");
        set.add("Radio");
        set.add("Pc Gamer");
        set.add("Monitor");
        set.add("Mouse");
        set.add("Keyboard");
        set.add("Mousepad");
        set.add("SoundBar");
        set.add("Projetor");
        set.add("Tapete");
        set.add("Fio Dental");
        set.add("TopGeo");
        set.add("Vale");
        set.add("Java");
        set.add("Microfone");
        set.add("Headset");

        //set.remove("Keyboard");

        for (String p : set) {
            System.out.println(p);
        }
    }
}
