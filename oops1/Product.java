class Product {
    int prod_id;
    String prod_name;
    double price;
    int quantity_on_hand;

    void init(int id, String name, double price) {
        this.prod_id = id;
        this.prod_name = name;
        this.price = price;
    }

    double getNetPrice() {
        return price + (price * 0.12);   // 12% tax
    }

    void purchase(int qty) {
        quantity_on_hand += qty;
    }

    void sell(int qty) {
        quantity_on_hand -= qty;
    }
}

