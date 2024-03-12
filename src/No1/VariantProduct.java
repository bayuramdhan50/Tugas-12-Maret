package No1;

// Kelas untuk merepresentasikan variasi produk (warna dan ukuran)
class VariantProduct {
    private String warna;
    private String ukuran;

    public VariantProduct(String warna, String ukuran) {
        this.warna = warna;
        this.ukuran = ukuran;
    }

    // Getter dan setter
    public String getColor() {
        return warna;
    }

    public void setColor(String warna) {
        this.warna = warna;
    }

    public String getSize() {
        return ukuran;
    }

    public void setSize(String ukuran) {
        this.ukuran = ukuran;
    }
}
