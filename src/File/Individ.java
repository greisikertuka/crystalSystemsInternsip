package File;
import java.io.*;
import java.util.ArrayList;
public class Individ implements Serializable{
    String emri;
    int mosha;
    Individ(){}
    Individ(String e,int m){
        emri=e;
        mosha=m;
    }
    public String toString(){
        return emri+ " "+mosha;
    }
    public static void main(String[] args) {
        Individ i1=new Individ("Mira",23);
        Individ i2=new Individ("Beni",21);
        Individ i3=new Individ("Andi",20);
        ArrayList<Individ> list=new ArrayList<Individ>();
        list.add(i1);
        list.add(i2);
        list.add(i3);
        try{
            FileOutputStream writeData=new FileOutputStream("list.ser");
            ObjectOutputStream writeStream=new ObjectOutputStream(writeData);
            writeStream.writeObject(list);
            writeStream.flush();
            writeStream.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        try{
            FileInputStream readData=new FileInputStream("list.ser");
            ObjectInputStream readStream=new ObjectInputStream(readData);
            ArrayList list2=(ArrayList<Individ>)readStream.readObject();
            readStream.close();
            System.out.println(list2.toString());
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}