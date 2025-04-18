package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) throws Exception {

        //Set<String> set = new HashSet<>();
        //Set<String> set = new TreeSet<>();
        Set<String> set = new LinkedHashSet<>();

        set.add("C");
        set.add("K");
        set.add("A");
        set.add("W");
        set.add("Y");
        set.add("B");
        set.add("D");
        set.add("S");
        set.add("T");
        set.add("E");
        set.add("P");
        set.add("I");
        set.add("L");
        set.add("Q");
        set.add("N");
        set.add("M");
        set.add("V");
        set.add("Uuu");

        //set.remove("C");
        //set.removeIf(x -> x.length() >= 3);
        set.removeIf(x -> x.charAt(0) == 'C');

        for (String p : set) {
            System.out.println(p);
        }
    }
}
