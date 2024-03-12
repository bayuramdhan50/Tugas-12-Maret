package No2;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private List<FoodItem> items;

    public Order(int orderId) {
        this.orderId = orderId;
        this.items = new ArrayList<>();
    }

    // Metode untuk menambahkan item makanan ke dalam pesanan
    public void addItem(FoodItem item) {
        items.add(item);
    }

    // Getter untuk daftar item makanan dalam pesanan
    public List<FoodItem> getItems() {
        return items;
    }

    // Getter dan setter lainnya
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}
