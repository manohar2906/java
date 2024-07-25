import java.io.File;
import java.io.IOException;

public class PropertieFile {
    public static void main(String args[]) throws IOException{
        File file = new File("manu.properties");
        if(!file.exists())
        file.createNewFile();
        System.out.println(file.exists());
    }
}
