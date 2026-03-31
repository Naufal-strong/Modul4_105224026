public class main {
    public static void main(String[] args) {

        // Soal 1 & 4 - Membuat objek
        MesinKopi mesinLobby = new MesinKopi();
        mesinLobby.tampilkanStok();

        System.out.println("========================");

        // Soal 2 - Isi ulang bahan
        mesinLobby.isiUlangBahan(20, 100, 150);
        mesinLobby.tampilkanStok();

        System.out.println("========================");

        // Soal 3 - Cek ketersediaan Cappuccino
        if (mesinLobby.cekKetersediaanCappuccino()) {
            System.out.println("Cappuccino BISA dibuat!");
        } else {
            System.out.println("Bahan TIDAK cukup.");
        }
    }
}