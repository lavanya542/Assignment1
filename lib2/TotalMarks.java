import java.io.*;
class TotalMarks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("Marks.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            int sum = 0;
            for (String s : line.split(",")) {
                try {
                    sum += Integer.parseInt(s.trim());
                } catch (Exception e) { }
            }
            System.out.println(sum);
        }
        br.close();
    }
}

