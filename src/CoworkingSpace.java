public class CoworkingSpace {
    private final int id;
    private final String type;
    private final double price;
    private boolean isAvailable;

    public CoworkingSpace(int id, String type, double price, boolean isAvailable) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.isAvailable = isAvailable;

    }


    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }


    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Type: " + type + ", Price: $" + price + ", Available: " + (isAvailable ? "Yes" : "No");
    }
}
