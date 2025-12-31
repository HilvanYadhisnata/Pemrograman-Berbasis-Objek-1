package Polymorphism;

public class PembayaranTransferBank extends Pembayaran {

    public PembayaranTransferBank(double jumlahBayar) {
        super(jumlahBayar);
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Memproses pembayaran transfer bank sebesar: Rp. " + getJumlahBayar());
    }

}
