package collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

    public final static String PATH = "/Users/rimjhim/Documents/git/Demo/src/config.properties";
    static Properties p;
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream(PATH);
            p = new Properties();
            p.load(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String browser = p.getProperty("browser");
        System.out.println(browser);

    }
}
