package NestedClass;
class KlJashtme {
    int x = 10;
    static class KlBrendshme {
        int y = 5;
    }
}
public class U3 {
    public static void main(String[] args) {
        //klasa e brendshme static krijohet pa krijuar objekt te KlJashtme
        KlJashtme.KlBrendshme myInner = new KlJashtme.KlBrendshme();
        System.out.println(myInner.y);
    }
}