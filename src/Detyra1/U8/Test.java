package Detyra1.U8;
import java.util.ArrayList;
public class Test {
    public static void main(String[] args) {
        ArrayList<Employee> list=new ArrayList<Employee>();
        Employee e=new Employee();
        Janitor j=new Janitor();
        Lawyer l=new Lawyer();
        HarvardLawyer hl=new HarvardLawyer();
        Marketer m=new Marketer();
        LegalSecretary ls=new LegalSecretary();
        Secretary s=new Secretary();
        System.out.println("\n\n\nTe dhenat e Employee:\n"
                +"\nOret:"+ e.getHours()+"\nPaga"+e.getSalary()+"\nDitet e pushimit"+e.getVacationDays()+"\nLetra per pushimet:"+e.getVacationForm());
        System.out.println("\n\n\nTe dhenat e Janitor:\n"
                +"\nOret:"+ j.getHours()+"\nPaga"+j.getSalary()+"\nDitet e pushimit"+j.getVacationDays()+"\nLetra per pushimet:"+j.getVacationForm()+"\n");
        j.clean();
        System.out.println("\n\n\nTe dhenat e Lawyer:\n"
                +"\nOret:"+ l.getHours()+"\nPaga"+l.getSalary()+"\nDitet e pushimit"+l.getVacationDays()+"\nLetra per pushimet:"+l.getVacationForm()+"\n");
        l.sue();
        System.out.println("\n\n\nTe dhenat e HarwardLawyer:\n"
                +"\nOret:"+ hl.getHours()+"\nPaga"+hl.getSalary()+"\nDitet e pushimit"+hl.getVacationDays()+"\nLetra per pushimet:"+hl.getVacationForm()+"\n");
        hl.sue();
        System.out.println("\n\n\nTe dhenat e Marketer:\n"
                +"\nOret:"+ m.getHours()+"\nPaga"+m.getSalary()+"\nDitet e pushimit"+m.getVacationDays()+"\nLetra per pushimet:"+m.getVacationForm()+"\n");
        m.advertise();
        System.out.println("\n\n\nTe dhenat e Secretary:\n"
                +"\nOret:"+ s.getHours()+"\nPaga"+s.getSalary()+"\nDitet e pushimit"+s.getVacationDays()+"\nLetra per pushimet:"+s.getVacationForm()+"\n");
        s.takeDictation("Takim me bordin ne oren 8");
        System.out.println("\n\n\nTe dhenat e LegalSecretary:\n"
                +"\nOret:"+ ls.getHours()+"\nPaga"+ls.getSalary()+"\nDitet e pushimit"+ls.getVacationDays()+"\nLetra per pushimet:"+ls.getVacationForm()+"\n");
        ls.fileLegalBriefs();


    }

}
