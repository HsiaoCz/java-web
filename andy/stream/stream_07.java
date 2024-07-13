package andy.stream;

import java.io.*;

public class stream_07 {
    public static void main(String[] args) {
        // I/O的常见异常
        // FileNotFontException
        FileInputStream in = null;
        try {
            in = new FileInputStream("./hello");
        } catch (FileNotFoundException e) {
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
