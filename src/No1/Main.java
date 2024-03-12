package No1;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Membuat produk pakaian
        ClothingProduct shirt = new ClothingProduct("Kaos", 50.000);

        // Menambahkan beberapa variasi
        shirt.addVariant("Red", "M");
        shirt.addVariant("Blue", "L");

        // Mengakses dan mencetak variasi produk
        List<VariantProduct> variants = shirt.getVariants();
        for (VariantProduct variant : variants) {
            System.out.println("Warna: " + variant.getColor() + ", Ukuran: " + variant.getSize());
        }
    }
}
