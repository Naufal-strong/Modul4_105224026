public class DuitKu {

    String namaLengkap;
    String nomorPonsel;
    double saldo;

    public DuitKu(String namaLengkap, String nomorPonsel) {
        this.namaLengkap = namaLengkap;
        this.nomorPonsel = nomorPonsel;
        this.saldo = 0;
        System.out.println("=============================");
        System.out.println("Pelanggan baru terdaftar!");
        System.out.println("Nama   : " + this.namaLengkap);
        System.out.println("No HP  : " + this.nomorPonsel);
        System.out.println("Saldo  : Rp " + this.saldo);
        System.out.println("=============================");
    }

    public void isiDana(double jumlah) {
        if (jumlah < 10000) {
            System.out.println("GAGAL! Minimum setoran adalah Rp 10.000");
        } else {
            this.saldo += jumlah;
            System.out.println("=============================");
            System.out.println("-- STRUK SETORAN --");
            System.out.println("Nama   : " + this.namaLengkap);
            System.out.println("Setor  : Rp " + jumlah);
            System.out.println("Saldo  : Rp " + this.saldo);
            System.out.println("=============================");
        }
    }

    public boolean lunasiTagihan(double jumlah) {
        if (this.saldo >= jumlah) {
            this.saldo -= jumlah;
            System.out.println("=============================");
            System.out.println("BERHASIL! Tagihan terbayar.");
            System.out.println("Tagihan: Rp " + jumlah);
            System.out.println("Saldo  : Rp " + this.saldo);
            System.out.println("=============================");
            return true;
        } else {
            System.out.println("=============================");
            System.out.println("GAGAL! Saldo tidak cukup.");
            System.out.println("Tagihan: Rp " + jumlah);
            System.out.println("Saldo  : Rp " + this.saldo);
            System.out.println("=============================");
            return false;
        }
    }

    public void tampilkanSaldo() {
        System.out.println("=============================");
        System.out.println("Sisa saldo " + this.namaLengkap + ":");
        System.out.println("Rp " + this.saldo);
        System.out.println("=============================");
    }
}