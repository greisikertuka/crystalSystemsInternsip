package Detyra1.U8;

//Nje klase punonjesish Janitor qe shoqeron punonjesit e tjere
public class Janitor extends Employee {
    public int getHours() {
        return 80;           // works 80 hours / week
    }

    public double getSalary() {
        return super.getSalary() - 10000;      // $30,000.00 / year
    }

    public int getVacationDays() {
        return super.getVacationDays() / 2;           // 1 week paid vacation
    }

    public void clean() {
        System.out.println("Workin' for the man.");
    }
}
