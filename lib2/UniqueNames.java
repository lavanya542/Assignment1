import java.io.*;
import java.util.*;
class UniqueNames {
    public static void main(String[] args) throws Exception {
        TreeSet<String> set = new TreeSet<>();
        BufferedReader br = new BufferedReader(new FileReader("names.txt"));
        String s;
        while ((s = br.readLine()) != null) set.add(s);
        br.close();
        set.forEach(System.out::println);
    }
}

