public class MesinKopi {
    //no 1
    float bubukKopi;
    float airPanas;
    float susuSegar;

    //no 4
    public MesinKopi() {
        this.bubukKopi = 0;
        this.airPanas = 0;
        this.susuSegar = 0;
    }

    //no 2
    public void isiUlangBahan(int tambahBubuk, int tambahAir, int tambahSusu) {
        this.bubukKopi += tambahBubuk;
        this.airPanas += tambahAir;
        this.susuSegar += tambahSusu;
        System.out.println("Bahan berhasil diisi ulang!");
    }

    //no 3
    public boolean cekKetersediaanCappuccino() {
        return (bubukKopi >= 15 && airPanas >= 50 && susuSegar >= 100);
    }

    public void tampilkanStok() {
        System.out.println("Stok saat ini:");
        System.out.println("Bubuk kopi: " + bubukKopi + " gram");
        System.out.println("Air panas: " + airPanas + " ml");
        System.out.println("Susu segar: " + susuSegar + " ml");
    }
}