package Polymorphism;

public class PembayaranTunai extends Pembayaran {
    public PembayaranTunai(double jumlahBayar) {
        super(jumlahBayar);
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Memproses pembayaran tunai sebesar: Rp. " + getJumlahBayar());
    }
    
}
