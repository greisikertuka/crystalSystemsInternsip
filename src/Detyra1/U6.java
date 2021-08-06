package Detyra1;
import java.util.Scanner;
class IntList{
    protected int[] list;
    protected int numElements = 0;
    public IntList(int size){
        list = new int[size];
    }
    public void add(int value){
        if (numElements == list.length)
            System.out.println("Can't add, list is full");
        else{
            list[numElements] = value;
            numElements++;
        }}
    public String toString(){
        String returnString = "";
        for (int i=0; i<numElements; i++)
            returnString += i + ": " + list[i] + "\n";return returnString;
    }}
class SortedList extends IntList{
    public SortedList(int size){
        super(size);
    }
    public void add(int value){
        if(numElements==0){
            list[0]=value;
            numElements++;
        }
        else if(numElements==1) {
            numElements++;
            if(value<list[0])  {
                list[1]=list[0];
                list[0]=value;
            }
            else
                list[1]=value;
        }
        else if (numElements == list.length)
            System.out.println("Can't add, list is full");
        else {
            numElements++;
            int test;
            for (int i=0; i<numElements-1; i++) {
                test=1;
                if(list[i]>=value) {
                    test=0;
                    int m=list[i];
                    int n=m;
                    list[i]=value;
                    for (int j=i+1; j<numElements;j++) {
                        n=list[j];
                        list[j]=m;
                        m=n;
                    }
                }         if(test==0) break;

                if(test==1) {
                    list[numElements-1]=value;
                }}}}
    public String toString(){
        return super.toString();
    }}
public class U6{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Jep numrin e elementeve:");
        int n=scn.nextInt(),element;
        IntList myList = new IntList(n);
        SortedList list1 = new SortedList(n);

        for(int i=0;i<n;i++) {
            System.out.println("Jep elementin e "+(i+1));
            element=scn.nextInt();
            myList.add(element);
            list1.add(element);
        }
        System.out.println(myList);
        System.out.println("Vektori i renditur:\n"+list1);
    }}
