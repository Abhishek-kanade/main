import java.io.File;
import java.io.IOException;
class file{
    public static void main(String[] args) throws IOException{
        System.out.println("hello");
        File fp= new File("file.txt");
        fp.createNewFile();
    }
}