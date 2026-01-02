import java.io.*;
class WriteMarks {
    public static void main(String[] args) throws Exception {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("Marks.data"));
        for (int i = 1; i <= 20; i++)
            dos.writeInt(i * 5);
        dos.close();
    }
}

