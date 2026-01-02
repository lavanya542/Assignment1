import java.io.*;
import java.util.*;
class Codes {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String s;
        while (!(s=sc.next()).equals("end"))
            if (s.matches("[A-Za-z]+[0-9]+")) list.add(s);
        Collections.sort(list);
        BufferedWriter bw = new BufferedWriter(new FileWriter("Codes.txt"));
        for (String x:list){ bw.write(x); bw.newLine(); }
        bw.close();
    }
}

