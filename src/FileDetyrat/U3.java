/*
Exercise 8.3. Write a public static method that prints on the video all lines of a file that start with one of
the characters ’/’, ’;’, or ’%’. The name of the file should be given as a parameter.
*/

package FileDetyrat;
import java.io.*;
public class U3 {
    public static void main(String[] args) throws IOException {
// Hapja e file per lexim
        FileReader f = new FileReader("test.txt");
// Krijojme objektin per lexim
        BufferedReader in = new BufferedReader(f);
        String line = in.readLine();
        while(line!=null){
            if(line.charAt(0)=='/'||line.charAt(0)==';'||line.charAt(0)=='%')
                System.out.println(line);
            line = in.readLine();
        }
        f.close();
    }
}
