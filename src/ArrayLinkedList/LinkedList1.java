package ArrayLinkedList;
import java.util.LinkedList;
import java.util.List;

class Libri{
    private String titulli;
    private int cmimi;
    Libri(){}
    Libri(String t,int c){
        titulli=t;
        cmimi=c;
    }
    public void setTitulli(String t){
        titulli=t;
    }
    public void setCmimi(int c){
        cmimi=c;
    }
    public String getTitulli(){
        return titulli;
    }
    public int getCmimi(){
        return cmimi;
    }

}
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Libri> l=new LinkedList<Libri>();
        l.add(new Libri("I huaji",2300)) ;
        l.add(new Libri("Eugjen Onjegini",2300)) ;
        l.add(new Libri("100 vjet vetmi",2300)) ;
        for(Libri libri:l){
            System.out.println("Libri:\nTitulli: "+libri.getTitulli()+"" +
                    "\nCmimi: "+libri.getCmimi());
        }
        l.remove(1);
        System.out.println("\n\nPasi u hoq elementi me indeks 1:\n");
        for(Libri libri:l){
            System.out.println("Libri:\nTitulli: "+libri.getTitulli()+"" +
                    "\nCmimi: "+libri.getCmimi());
        }
        l.set(1,new Libri("Nje zemer e dobet",2300)) ;
        System.out.println("\n\nPas shtimit te elementit \""+l.get(1).getTitulli()+"\":\n");
        for(Libri libri:l){
            System.out.println("Libri:\nTitulli: "+libri.getTitulli()+"" +
                    "\nCmimi: "+libri.getCmimi());
        }
        l.get(1).setCmimi(2000);
        System.out.println("\n\nPas berjes se cmimit te \""+l.get(1).getTitulli()+"\" "+l.get(1).getCmimi()+":\n");
        for(Libri libri:l){
            System.out.println("Libri:\nTitulli: "+libri.getTitulli()+"" +
                    "\nCmimi: "+libri.getCmimi());
        }
        l.addFirst(new Libri("Krim dhe ndeshkim",2300)) ;
        System.out.println("\n\nPas shtimit te elementit \""+l.get(0).getTitulli()+"\" ne fillim:\n");
        for(Libri libri:l){
            System.out.println("Libri:\nTitulli: "+libri.getTitulli()+"" +
                    "\nCmimi: "+libri.getCmimi());
        }
        l.addLast(new Libri("Norwegian Wood",2300)); ;
        System.out.println("\n\nPas shtimit te elementit \""+l.get(l.size()-1).getTitulli()+"\" ne fund:\n");
        for(Libri libri:l){
            System.out.println("Libri:\nTitulli: "+libri.getTitulli()+"" +
                    "\nCmimi: "+libri.getCmimi());
        }
    }
}
