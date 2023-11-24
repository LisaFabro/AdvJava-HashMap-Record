public class Fruit {
    public String name;
    public double price;
    public Fruit(String name, double price){
        this.name=name;
        this.price=price;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
