package Threads;

import java.lang.Runnable;

/*The following Java application shows how the transactions
in a bank can be carried out concurrently. */
class Account {
    public int Totali;
    public int NrLlogarise;

    void displayTotali() {
        System.out.println("Numri i llogarise: " + NrLlogarise + " " +
                "\nBalanca/gjendja ne llogari: " + Totali);
    }

    synchronized void deposit(int shuma) {
        Totali = Totali + shuma;
        System.out.println(shuma + " euro jane depozituar!");
        displayTotali();
    }

    synchronized void terheqje(int shuma) {
        Totali = Totali - shuma;
        System.out.println(shuma + " euro eshte vlera qe terhoqe nga llogaria!");
        displayTotali();
    }
}

class DepoziataTransaksionit implements Runnable {
    int shuma;
    Account accountX;

    DepoziataTransaksionit(Account x, int shuma) {
        accountX = x;
        this.shuma = shuma;
        new Thread(this).start();
    }

    public void run() {
        accountX.deposit(shuma);
    }
}

class TransaksionTerheqje implements Runnable {
    int shuma;
    Account accountY;

    TransaksionTerheqje(Account y, int shuma) {
        accountY = y;
        this.shuma = shuma;
        new Thread(this).start();
    }

    public void run() {
        accountY.terheqje(shuma);
    }
}

class Balanca {
    public static void main(String args[]) {
        Account ABC = new Account();
        ABC.Totali = 1000;
        ABC.NrLlogarise = 111;
        DepoziataTransaksionit t1 = new DepoziataTransaksionit(ABC, 500);
        TransaksionTerheqje t2 = new TransaksionTerheqje(ABC, 900);
    }
}