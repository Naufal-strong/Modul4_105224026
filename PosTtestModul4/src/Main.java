import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input data pelanggan
        System.out.print("Masukkan nama lengkap : ");
        String nama = input.nextLine();

        System.out.print("Masukkan nomor ponsel : ");
        String nomorPonsel = input.nextLine();

        // Membuat objek dari class DuitKu
        DuitKu pelanggan = new DuitKu(nama, nomorPonsel);

        // Input setoran pertama
        System.out.print("Masukkan jumlah setoran pertama : Rp ");
        double setoran1 = input.nextDouble();
        pelanggan.isiDana(setoran1);

        // Input tagihan
        System.out.print("Masukkan jumlah tagihan listrik : Rp ");
        double tagihan = input.nextDouble();

        // Coba bayar pertama
        System.out.println("Mencoba melunasi tagihan...");
        boolean berhasil = pelanggan.lunasiTagihan(tagihan);

        // Jika gagal, minta setor lagi
        if (!berhasil) {
            System.out.print("Masukkan jumlah setoran tambahan : Rp ");
            double setoran2 = input.nextDouble();
            pelanggan.isiDana(setoran2);

            // Coba bayar lagi
            System.out.println("Mencoba melunasi tagihan lagi...");
            pelanggan.lunasiTagihan(tagihan);
        }

        // Tampilkan sisa saldo akhir
        pelanggan.tampilkanSaldo();

        input.close();
    }
}