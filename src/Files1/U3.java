package Files1;
import java.io.*;

//Ne kete prograjme lexojme stream nga tastiera
public class U3 {
    public static void main(String[] args) {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        PrintStream ps=new PrintStream(System.out);
        try {
            System.out.println("Jep nje rresht nga tastiera:");
            String line=br.readLine();
            ps.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ps.close();
        try{
            br.close();
            isr.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
