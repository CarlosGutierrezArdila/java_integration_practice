package sorting;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.Class;
import java.util.Properties;

public class MiFactory {
    public static Object getInstance(String objName) throws Exception {
        Properties prop = new Properties();
        String propFileName = "MiFactory.properties";
        FileReader reader = new FileReader(propFileName);
        prop.load(reader);
        System.out.println(prop.getProperty("sorter"));
        Sorter s = (Sorter) Class.forName(prop.getProperty("sorter")).getDeclaredConstructor().newInstance();
        return s;
    }

}
