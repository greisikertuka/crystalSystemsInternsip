package NestedClass;

class KlasaeJashtme {
    int x = 10;

    private class KlaseBrendshme {
        int y = 5;
    }
}

public class U2 {
    public static void main(String[] args) {
        KlasaeJashtme myOuter = new KlasaeJashtme();
        //KlasaeJashtme.KlaseBrendshme myInner = myOuter.new KlaseBrendshme();
        //System.out.println(myInner.y + myOuter.x);
        //Nuk aksesohen elementet e klases private
    }
}