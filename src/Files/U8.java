package Files;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class U8 {
    public static void main(String[] args) {
        try{
          /*
            Scanner scn=new Scanner(System.in);
            System.out.println("Jep emrin e file:");
            File f0=new File(scn.nextLine());
            scn.close();
            */
            File f=new File("C:\\Users\\kertu\\OneDrive\\Pictures\\minions\\New folder\\file1.txt");
            Scanner lexim=new Scanner(f);
            while(lexim.hasNextLine()){
            String teDhena=lexim.nextLine();
            System.out.println(teDhena);
            }
            lexim.close();
        }
        catch (IOException e){
            System.out.println("U shfaq nje error!");
            e.printStackTrace();
        }
    }
}
