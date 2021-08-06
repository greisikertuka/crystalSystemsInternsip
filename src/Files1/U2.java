//Leximi nga file
package Files1;
import java.io.*;
public class U2 {
    public static void main(String[] args) throws IOException {
        FileReader f= null;
        try {
            f = new FileReader("U1.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader br=new BufferedReader(f);
        int numri=0;
        String s="";
        String s1=br.readLine();
        while(s1!=null){
                   numri++;
                   s+=s1+"\n";
                   s1=br.readLine();
        }
        System.out.println(s);
            br.close();
            f.close();
            File f11=new File("f11.txt");
            boolean b=f11.delete();
            System.out.println(b?"File prove u fshi!":"File prove nuk u fshi!");
            File f111=new File("ushtrr.txt");
            File f22=new File("ush.txt");
            Boolean b1=f111.renameTo(f22);
            System.out.println(b1?"Emri i ri i file f111:"+f111.getName():"File nuk ju ndryshua emri!");

    }
}
