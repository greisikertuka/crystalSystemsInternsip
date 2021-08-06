package Files;
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class ShkruajFile {
    private Formatter output;
        public static void main(String[] args) {
           ShkruajFile f=new ShkruajFile();
           f.hapFile();
           f.shtoRekord();
           f.mbyllFile();
        }
       public void hapFile(){
         try{
             output=new Formatter("Studente.txt");
         }
         //Kur s kemi te drejta aksesi per file
         catch (SecurityException e){
             System.out.println("Nuk keni te drejta shkrimi!");
             System.exit(1);  //Mbaron programi me nje gabim
         }
         //Kur File s'ekziston ose s mund te krijohet
         catch (FileNotFoundException e){
             System.out.println("File nuk ekziston!");
             System.exit(1);  //Mbaron programi me nje gabim
         }
     }
     public void shtoRekord(){
         Scanner scn=new Scanner(System.in);
         System.out.println("");
         System.out.println("Per te dale shtyp ctrl+d (qe eshte end-of-file)" +
                 "\nJep emrin, id (>0), moshen dhe mesataren:");
         while (scn.hasNext()){
             try{
                 //Sa here japim input krijohet objekti st, qe ruhet ne file
                 StudentRekord st=new StudentRekord(scn.next(),scn.nextInt(),scn.nextInt(),scn.nextDouble());
                 if (st.id>0){
                     output.format("%d %s %d %f \n", st.id, st.emri, st.mosha, st.mesatare);
                 }
                 else{
                     System.out.println("ID duhet te jete > 0!");
                 }
             }
             //Kur formatteri mbyllet nderkohe qe japim te dhena
             catch (FormatterClosedException e){
                 System.out.println("Gabim te shkrimi i file!");
             }
             //Te dhenat ne formatin e gabuar
             catch (NoSuchElementException e){
                 System.out.println("Jo e vlefshme! Perseriteni:");
             }
             System.out.println("\"Per te dale shtyp ctrl+d (qe eshte end-of-file)\"" +
                     "\nJep emrin, id (>0), moshen dhe mesataren:");
         }
         System.out.println("Te dhenat u regjistruan ne file!");
     }
     //Per mbylljen e file
     public void mbyllFile(){
         if(output!=null)
             output.close();
     }
}
