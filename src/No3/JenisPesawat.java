package No3;

public class JenisPesawat {
    private String nama;
    private String tipeLayanan;

    public JenisPesawat(String nama, String tipeLayanan) {
        this.nama = nama;
        this.tipeLayanan = tipeLayanan;
    }

    // Getter dan setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTipeLayanan() {
        return tipeLayanan;
    }

    public void setTipeLayanan(String tipeLayanan) {
        this.tipeLayanan = tipeLayanan;
    }
}
