package FileDetyrat;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Apartament{
    String qyteti;
    String lagjia;
    int numri;
    Apartament() {
    }
    Apartament(String q, String l, int n) {
        qyteti = q;
        lagjia=l;
        numri=n;
    }
    public String toString() {
        return "Qyteti: "+ qyteti+"\nLagjia: " +lagjia+ "\nNumri: " + numri;
    }
    void saveToFile(String filename){
        try{
            System.out.println("Te dhenat po ruhen ne file!");
            FileWriter fw=new FileWriter(filename);
            PrintWriter pw=new PrintWriter(fw);
            pw.println(this.qyteti+"\n"+this.lagjia+"\n"+this.numri+"\n");
            System.out.println(this.toString());
            pw.close();
            fw.close();
            System.out.println("Te dhenat per apartamentin u ruajten ne file!");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    static Apartament readFromFile(BufferedReader br) throws IOException{
                Apartament a=new Apartament();
                a.qyteti=br.readLine();
                a.lagjia=br.readLine();
                a.numri=Integer.parseInt(br.readLine());
                return a;
    }
}
class U8{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        Apartament a=new Apartament();
        System.out.println("Jep qytetin per apartamentin e krijuar:");
        a.qyteti=scn.nextLine();
        System.out.println("Jep lagjien ku ndodhet apartamenti:");
        a.lagjia=scn.nextLine();
        System.out.println("Jep numrin e apartamentit:");
        a.numri=scn.nextInt();
        System.out.println("Jep emrin e file ku do shkruani:");
        String filename=scn.next();
        scn.close();
        a.saveToFile(filename);
        FileReader fr= null;
        try {
        fr = new FileReader(filename);
        BufferedReader br=new BufferedReader(fr);
        System.out.println("Apartamenti i krijuar nga metoda ReadFromFile:\n"+a.readFromFile(br).toString());
        br.close();
        fr.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        scn.close();
    }
}