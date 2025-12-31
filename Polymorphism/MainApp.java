package Polymorphism;

public class MainApp {
    public static void main(String[] args) {
        Pembayaran bayar1 = new PembayaranTunai(50000);
        Pembayaran bayar2 = new PembayaranKartuKredit(150000);
        Pembayaran bayar3 = new PembayaranEWallet(75000);
        Pembayaran bayar4 = new PembayaranTransferBank(200000);
        Pembayaran bayar5 = new PembayaranQRIS(120000);

        bayar1.prosesPembayaran();
        bayar2.prosesPembayaran();
        bayar3.prosesPembayaran();
        bayar4.prosesPembayaran();
        bayar5.prosesPembayaran();
        
    }
}
