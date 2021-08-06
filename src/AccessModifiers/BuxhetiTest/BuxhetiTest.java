package AccessModifiers.BuxhetiTest;
import AccessModifiers.Buxheti.*;
public class BuxhetiTest extends Buxheti{
    public BuxhetiTest(){}
    public BuxhetiTest(int b, int u, int t, int v, int tj) {
        super(b,u,t,v,tj);
    }

    public static void main(String[] args) {
        BuxhetiTest b1 =new BuxhetiTest();
        System.out.println("====Shpenzimet kur kostruktori eshte default====" +
                "\nBanimi:"+ b1.getBanimi()+"\nUshqimi:"+ b1.getUshqimi()+"\nTransporti:"+ b1.getTransporti()+"" +
                "\nVeshmbathje:"+ b1.getVeshmbathje()+"\nTe tjera:"+ b1.getTjera()+"\nTotali:"+ b1.getShuma());
        BuxhetiTest b2=new BuxhetiTest(200,30,110,70,60);
        System.out.println("====Shpenzimet kur e plotesojme me te dhenat====" +
                "\nBanimi:"+ b2.getBanimi()+"\nUshqimi:"+ b2.getUshqimi()+"\nTransporti:"+ b2.getTransporti()+"" +
                "\nVeshmbathje:"+ b2.getVeshmbathje()+"\nTe tjera:"+ b2.getTjera()+"\nTotali:"+ b2.getShuma());

    }
}
