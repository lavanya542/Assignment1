import java.io.*;
class CountChars {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("test.txt");
        int c, u=0,l=0,d=0;
        while ((c = fr.read()) != -1) {
            if (Character.isUpperCase(c)) u++;
            else if (Character.isLowerCase(c)) l++;
            else if (Character.isDigit(c)) d++;
        }
        System.out.println(u+" "+l+" "+d);
        fr.close();
    }
}

