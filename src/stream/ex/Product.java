package stream.ex;

class Product {
    String name;
    double price;
    int reviews;

    Product(String name, double price, int reviews) {
        this.name = name;
        this.price = price;
        this.reviews = reviews;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getReviews() {
        return reviews;
    }

    @Override
    public String toString() {
        return "%s - $%.2f, Reviews: %d".formatted(getName(), getPrice(), getReviews());
    }
}
