import java.io.*;
import java.util.*;
class Customers {
    public static void main(String[] args) throws Exception {
        TreeMap<String,String> map = new TreeMap<>();
        BufferedReader br = new BufferedReader(new FileReader("customers.txt"));
        String line;
        while ((line=br.readLine())!=null) {
            String[] p = line.split("\\s+");
            map.put(p[0], p[1]);
        }
        br.close();
        map.forEach((k,v)->System.out.println(k+" "+v));
    }
}

