import java.nio.file.*;
class UpperFile {
    public static void main(String[] args) throws Exception {
        Path p = Paths.get("test.txt");
        Files.write(p, Files.readString(p).toUpperCase().getBytes());
    }
}

