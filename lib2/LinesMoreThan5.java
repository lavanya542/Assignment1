import java.io.*;
class LinesMoreThan5 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        String line;
        while ((line = br.readLine()) != null)
            if (line.length() > 5)
                System.out.println(line);
        br.close();
    }
}

