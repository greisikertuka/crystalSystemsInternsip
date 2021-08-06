package AccessModifiers;
class Qeni{
    protected void leh(){
        System.out.println("Printim nga klasa qeni!");
    }
}
public class U1 {
    public static void main(String[] args) {
        Qeni q=new Qeni();
        //Aksesi i protected eshte direkt brenda pakates
        q.leh();
    }
}
