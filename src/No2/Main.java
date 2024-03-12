package No2;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Membuat pesanan
        Order order = new Order(123);

        // Menambahkan beberapa item makanan ke dalam pesanan
        order.addItem(new FoodItem("Nasi Goreng", 14000));
        order.addItem(new FoodItem("Ayam Goreng", 12000));

        // Mengakses dan mencetak daftar item makanan dalam pesanan
        List<FoodItem> items = order.getItems();
        for (FoodItem item : items) {
            System.out.println("Item: " + item.getName() + ", Harga: RP " + item.getPrice());
        }
    }
}
