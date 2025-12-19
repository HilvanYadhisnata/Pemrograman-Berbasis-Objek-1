public class PengirimanReguler extends Pengiriman {
    public PengirimanReguler(double berat, double jarak) {
        super(berat, jarak);
    }
    
    @Override
    public double hitungOngkir() {
        return 5000 + (2000 * berat) + (500 * jarak);
    }
    
    @Override
    public String getEstimasi() {
        return "3-5 hari";
    }
    
    @Override
    public String getNamaLayanan() {
        return "Reguler";
    }

}
