package Detyra1.U8;

//Nje klase punonjesish Marketer qe shoqeron punonjesit e tjere
public class Marketer extends Employee {
    public double getSalary() {
        return super.getSalary() + 10000;      // $40,000.00 / year
    }

    public void advertise() {
        System.out.println("Act now,while supplies last");
    }
}
