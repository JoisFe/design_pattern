package decoratorpattern.java_io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author : 조재철
 * @since 1.0
 */
public class InputTest {

    public static void main(String[] args) {
        int c;

        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("src/decoratorpattern/java_io/test.txt")));

            while ((c = in.read()) >= 0) {
                System.out.println((char) c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
