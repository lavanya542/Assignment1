import java.util.*;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " " + price;
    }
}

class SortByName implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        return p1.name.compareTo(p2.name);
    }
}

class SortByPrice implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.price, p2.price);
    }
}

class TestProduct {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product(1,"Pen",10));
        list.add(new Product(2,"Book",50));

        Collections.sort(list, new SortByPrice());
        System.out.println(list);
    }
}

