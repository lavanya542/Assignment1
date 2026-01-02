import java.io.*;
import java.util.*;
class UniqueOrder {
    public static void main(String[] args) throws Exception {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for (String f : new String[]{"names1.txt","names2.txt"}) {
            BufferedReader br = new BufferedReader(new FileReader(f));
            String s;
            while ((s = br.readLine()) != null) set.add(s);
            br.close();
        }
        set.forEach(System.out::println);
    }
}

