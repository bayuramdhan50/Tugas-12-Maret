package No4;

public class JenisPerangkat {
    private String nama;
    private String tipe;

    public JenisPerangkat(String nama, String tipe) {
        this.nama = nama;
        this.tipe = tipe;
    }

    // Getter dan setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
}
