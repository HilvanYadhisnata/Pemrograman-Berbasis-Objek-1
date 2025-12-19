public class PengirimanSameDay extends Pengiriman {
    
    public PengirimanSameDay(double berat, double jarak) {
        super(berat, jarak);
    }
    
    @Override
    public double hitungOngkir() {
        return 20000 + (4000 * berat) + (1200 * jarak);
    }
    
    @Override
    public String getEstimasi() {
        return "6-10 jam";
    }
    
    @Override
    public String getNamaLayanan() {
        return "Same Day";
    }
}
