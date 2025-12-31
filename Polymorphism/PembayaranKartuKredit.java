package Polymorphism;

public class PembayaranKartuKredit extends Pembayaran {

    public PembayaranKartuKredit(double jumlahBayar) {
        super(jumlahBayar);
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Memproses pembayaran kartu kredit sebesar: Rp. " + getJumlahBayar());
    }
    
}
