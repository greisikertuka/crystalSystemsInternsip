package Files;

import java.io.File;
import java.io.IOException;

public class U7 {
    public static void main(String[] args) {

        File f = new File("C:\\Users\\kertu\\OneDrive\\Pictures\\minions\\New folder\\file.txt");
        try {
            if (f.createNewFile())  //Mund te beje throw nje IOException
                System.out.println("File u krijua!");
            else
                System.out.println("File ekziston!");
        } catch (IOException e) {
            System.out.println("Error te hapja e file!");
            e.printStackTrace();
        }
        System.out.println("Te dhenat e file:");
        System.out.println("Emri i file: " + f.getName());
        System.out.println("Pathi absolut: " + f.getAbsolutePath());
        System.out.println("A eshte i shkruajtshem: " + f.canWrite());
        System.out.println("A eshte i lexueshem: " + f.canRead());
        System.out.println("Madhesia e file ne byte: " + f.length());
    }
}
