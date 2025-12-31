package Polymorphism;

public class PembayaranQRIS extends Pembayaran {

    public PembayaranQRIS(double jumlahBayar) {
        super(jumlahBayar);
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Memproses pembayaran QRIS sebesar: Rp. " + getJumlahBayar());
    }
}
