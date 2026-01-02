class Product2 {
    int id;
    String name;
    double price;

    Product() {
        id = 0;
        name = "NA";
        price = 0;
    }

    Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Product(int id, String name, double price) {
        this(id, name);
        this.price = price;
    }
}

