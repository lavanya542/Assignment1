import java.io.*;
import java.util.*;
class WriteNames {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new FileWriter("names.txt"));
        String name;
        while (!(name = sc.nextLine()).equals("END")) {
            bw.write(name);
            bw.newLine();
        }
        bw.close();
    }
}

