public class PengirimanExpress extends Pengiriman {
    
    public PengirimanExpress(double berat, double jarak) {
        super(berat, jarak);
    }
    
    @Override
    public double hitungOngkir() {
        return 10000 + (3000 * berat) + (800 * jarak);
    }
    
    @Override
    public String getEstimasi() {
        return "1-2 hari";
    }
    
    @Override
    public String getNamaLayanan() {
        return "Express";
    }
}