package Polymorphism;

public class PembayaranEWallet extends Pembayaran {

    public PembayaranEWallet(double jumlahBayar) {
        super(jumlahBayar);
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Memproses pembayaran e-wallet sebesar: Rp. " + getJumlahBayar());
    }
    
}