package Trashegimia;
class AA{
    public void printim(String s){
        System.out.println("Printim nga klasa AA\nStringa qe keni dhene eshte:"+s);
    }
    public static void printo(int n){
        System.out.println("Printim nga klasa AA\nNumri qe keni dhene eshte:"+n);
    }
}
class BB extends AA{
    //Metoda printim anashkalon metoden printim te superklases
    public void printim(String s){
        System.out.println("Printim nga klasa BB\nStringa qe keni dhene eshte:"+s);
    }
    //Metoda printo fsheh metoden printo te superklases
    public static void printo(int n){
        System.out.println("printim nga klasa BB\nNumri qe keni dhene eshte:"+n);
    }
}
//Nqs behet Override te metodes static me public ose anasjelltas eshte gabim komplimi
public class U1 {
    public static void main(String[] args) {
        AA aa =new AA();
        aa.printo(10);
        aa.printim("Prova 1");
        BB bb=new BB();
        bb.printo(20);
        bb.printim("Prova 2");
    }
}
