package Polymorphism;

public abstract class Pembayaran {
    private double jumlahBayar;

    public Pembayaran(double jumlahBayar) {
        this.jumlahBayar = jumlahBayar;
    }

    public double getJumlahBayar() {
        return jumlahBayar;
    }

    public void setJumlahBayar(double jumlahBayar) {
        if (jumlahBayar < 0) {
            throw new IllegalArgumentException("Jumlah bayar tidak boleh negatif.");
        }
        this.jumlahBayar = jumlahBayar;
    }

    

    public abstract void prosesPembayaran();
}
