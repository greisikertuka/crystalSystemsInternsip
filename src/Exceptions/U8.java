package Exceptions;
class U8{
    int count = 0;
    void A() throws Exception {
        try {
            count++;
            try {
                count++;
                try {
                    count++;
                    throw new Exception();
                }
                catch(Exception ex) {
                    count++;
                    throw new Exception();
                }
            }
            catch(Exception ex) {
                count++;
            }
        }
        //Ky bllok nuk ekzekutohet, pasi s ka throw te try i pare
        catch(Exception ex) {
            count++;
        }
    }
    void display() {
        System.out.println(count);
    }
    public static void main(String[] args) throws Exception {
        U8 obj = new U8();
        obj.A();
        obj.display();
    }
}
/*

        (A) 4
     -->(B) 5
        (C) 6
        (D) Compilation error

*/
