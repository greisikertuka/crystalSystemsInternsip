package Permbledhje1;

import java.util.Scanner;

class Dog implements Cloneable{
    private String name;
    Dog(){}
    Dog(String n){
        name=n;
    }
    public void bark(){
        System.out.println("Qenii: "+name+ " po leh!");
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class U3 {
    public static void main(String[] args) throws CloneNotSupportedException{
        Scanner scn=new Scanner(System.in);
        System.out.println("Jep emrin e qenit:");
        Dog d=new Dog(scn.nextLine());
        d.bark();
        Dog dCopy=(Dog)d.clone();
        System.out.println("Metoda bark te objekti i klonuar:");
        dCopy.bark();
        scn.close();
    }
}
