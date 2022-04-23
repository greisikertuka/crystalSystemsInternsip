package Files;

public class StudentRekord {
    int id;
    String emri;
    int mosha;
    double mesatare;

    StudentRekord() {
    }

    StudentRekord(String e, int i, int m, double mes) {
        id = i;
        emri = e;
        mosha = m;
        mesatare = mes;
    }
}