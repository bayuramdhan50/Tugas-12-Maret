package No4;

public class ProdukElektronik {
    private String merek;
    private String model;
    // Komposisi dengan kelas JenisPerangkat
    private JenisPerangkat jenisPerangkat;
    private int tahunProduksi;

    public ProdukElektronik(String merek, String model, JenisPerangkat jenisPerangkat, int tahunProduksi) {
        this.merek = merek;
        this.model = model;
        this.jenisPerangkat = jenisPerangkat;
        this.tahunProduksi = tahunProduksi;
    }

    // Getter dan setter
    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public JenisPerangkat getJenisPerangkat() {
        return jenisPerangkat;
    }

    public void setJenisPerangkat(JenisPerangkat jenisPerangkat) {
        this.jenisPerangkat = jenisPerangkat;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }
}
