package Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class U9 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\kertu\\OneDrive\\Pictures\\minions\\New folder\\file1.txt");
            fw.write("Prova per shkrimin ne file!");
            fw.close();
            System.out.println("U shkruajt me sukses ne file!");
        } catch (IOException e) {
            System.out.println("U shfaq nje problem");
            e.printStackTrace();
        }
    }
}
