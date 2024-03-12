package No1;
import java.util.ArrayList;
import java.util.List;

public class ClothingProduct {
    private String nama;
    private double harga;
    private List<VariantProduct> variants;

    public ClothingProduct(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
        this.variants = new ArrayList<>();
    }

    // Metode untuk menambahkan variasi produk
    public void addVariant(String warna, String ukuran) {
        VariantProduct variant = new VariantProduct(warna, ukuran);
        variants.add(variant);
    }

    // Getter untuk daftar variasi produk
    public List<VariantProduct> getVariants() {
        return variants;
    }

    // Getter dan setter lainnya
    public String getName() {
        return nama;
    }

    public void setName(String nama) {
        this.nama = nama;
    }

    public double getPrice() {
        return harga;
    }

    public void setPrice(double harga) {
        this.harga = harga;
    }
}
