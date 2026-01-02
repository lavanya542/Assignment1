import java.io.*;
class FindString {
    public static void main(String[] args) throws Exception {
        File dir = new File("path");
        String key = "hello";
        for (File f : dir.listFiles()) {
            BufferedReader br = new BufferedReader(new FileReader(f));
            if (br.lines().anyMatch(l->l.contains(key)))
                System.out.println(f.getName());
            br.close();
        }
    }
}

