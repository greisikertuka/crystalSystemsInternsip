package AccessModifiers.Buxheti;
public class Buxheti {
    private int banimi=150;
    private int ushqimi=90;
    private int transporti=25;
    private int veshmbathje=50;
    private int tjera=50;
    protected Buxheti(){}
    protected Buxheti(int b,int u,int t,int v,int tj){
        banimi=b;
        ushqimi=u;
        transporti=t;
        veshmbathje=v;
        tjera=t;
    }
    protected int getShuma(){
        return banimi+ushqimi+transporti+veshmbathje+tjera;
    }
    protected void setBanimi(int n){
        banimi=n;
    }
    protected void setUshqimi(int n){
        ushqimi=n;
    }
    protected void setTransporti(int n){
        transporti=n;
    }
    protected void setVeshmbathje(int n){
        veshmbathje=n;
    }
    protected void setTjera(int n){
        tjera=n;
    }
    protected int getBanimi(){
        return banimi;
    }
    protected int getUshqimi(){
        return ushqimi;
    }
    protected int getTransporti(){
        return transporti;
    }
    protected int getVeshmbathje(){
        return veshmbathje;
    }
    protected int getTjera(){
        return tjera;
    }
}
