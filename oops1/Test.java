class Product {
    String name;
    double base_price;

    Product(String name, double price) {
        this.name = name;
        this.base_price = price;
    }

    double getNetPrice() {
        return base_price;
    }

    void print() {
        System.out.println(name + " " + getNetPrice());
    }

    void setPrice(double price) {
        base_price = price;
    }
}

class ImportedProduct extends Product {
    double importDuty;

    ImportedProduct(String name, double price) {
        super(name, price);
    }

    void setImportDuty(double duty) {
        importDuty = duty;
    }

    double getNetPrice() {
        return base_price + importDuty;
    }
}

class DiscountedProduct extends Product {
    double discountRate;

    DiscountedProduct(String name, double price) {
        super(name, price);
    }

    void setDiscountRate(double rate) {
        discountRate = rate;
    }

    double getNetPrice() {
        return base_price - (base_price * discountRate / 100);
    }
}

class Test {
    public static void main(String[] args) {
        Product p = new ImportedProduct("Laptop", 50000); 
        ((ImportedProduct)p).setImportDuty(5000);         
        p.print();
    }
}

