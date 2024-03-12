package No3;

public class Pesawat {
    private String maskapai;
    private JenisPesawat jenisPesawat;
    private int jumlahKursi;
    private int tahunPembuatan;

    public Pesawat(String maskapai, JenisPesawat jenisPesawat, int jumlahKursi, int tahunPembuatan) {
        this.maskapai = maskapai;
        this.jenisPesawat = jenisPesawat;
        this.jumlahKursi = jumlahKursi;
        this.tahunPembuatan = tahunPembuatan;
    }

    // Getter dan setter
    public String getMaskapai() {
        return maskapai;
    }

    public void setMaskapai(String maskapai) {
        this.maskapai = maskapai;
    }

    public JenisPesawat getJenisPesawat() {
        return jenisPesawat;
    }

    public void setJenisPesawat(JenisPesawat jenisPesawat) {
        this.jenisPesawat = jenisPesawat;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }

    public int getTahunPembuatan() {
        return tahunPembuatan;
    }

    public void setTahunPembuatan(int tahunPembuatan) {
        this.tahunPembuatan = tahunPembuatan;
    }
}
