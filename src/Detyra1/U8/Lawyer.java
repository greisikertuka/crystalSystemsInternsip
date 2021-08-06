package Detyra1.U8;
//Nje klase qe perfaqeson juristet - lawyers.
public class Lawyer extends Employee {
    public int getVacationDays() {
        return super.getVacationDays() + 5;       // 3 weeks vacation
    }
    public String getVacationForm() {
        return "pink";
    }
    public void sue() {
        System.out.println("I'll see you in court!");
    }
}