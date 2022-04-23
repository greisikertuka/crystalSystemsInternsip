package Detyra1.U8;

//Nje klase punonjesish HarvardLawyer qe shoqeron punonjesit e tjere
public class HarvardLawyer extends Lawyer {
    public double getSalary() {
        return (super.getSalary()) * 1.2;      // $48,000.00 / year
    }

    public int getVacationDays() {
        return super.getVacationDays() + 3;
    }

    public String getVacationForm() {
        return super.getVacationForm() + super.getVacationForm() + super.getVacationForm();
    }
}
