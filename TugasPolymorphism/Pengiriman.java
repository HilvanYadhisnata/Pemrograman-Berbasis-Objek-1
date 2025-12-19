public abstract class Pengiriman {
    protected double berat; 
    protected double jarak;

    public Pengiriman(double berat, double jarak) {
        this.berat = berat;
        this.jarak = jarak;
    }

    public abstract double hitungOngkir();
    public abstract String getEstimasi();
    public abstract String getNamaLayanan();

    public void tampilkanRincian() {
        System.out.println("\n========== RINCIAN PENGIRIMAN ==========");
        System.out.println("Jenis Layanan    : " + getNamaLayanan());
        System.out.println("Berat Paket      : " + berat + " kg");
        System.out.println("Jarak Pengiriman : " + jarak + " km");
        System.out.println("Ongkir           : Rp " + String.format("%,.0f", hitungOngkir()));
        System.out.println("Estimasi         : " + getEstimasi());
        System.out.println("========================================\n");
    }

}
