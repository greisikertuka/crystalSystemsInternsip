package Exceptions;
class U7 {
    String str = "a";
    void A() {
        try {
            str +="b";
            B();
            }
        catch (Exception e){
            str += "c";
            }
    }
    void B() throws Exception {
        try {
            str += "d";
            C();
        }
        catch(Exception e) {
            throw new Exception();
        }
        finally {
            str += "e";
        }
        //pjesa pas finaly te metoda B nuk ekzekutohet
        str += "f";
    }
    void C() throws Exception {
        throw new Exception();
    }
    void display() {
        System.out.println(str);
    }
    public static void main(String[] args) {
        U7 object = new U7();
        object.A();
        object.display();
    }

} /*
        (A) abdef
        (B) abdec
        (C) abdefc
*/