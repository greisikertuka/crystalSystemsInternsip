package Files;
import java.io.File;
import java.io.IOException;
public class U6 {
    public static void main(String[] args) {
        try{
            File f=new File("C:\\Users\\kertu\\OneDrive\\Pictures\\minions\\New folder\\file.txt");
            if (f.createNewFile())
                System.out.println("File u krijua: "+f.getName());
            else
                System.out.println("File ekziston!");
        }
        catch (IOException e) {
            System.out.println("Error te hapja e file!");
            e.printStackTrace();
        }
    }
}
