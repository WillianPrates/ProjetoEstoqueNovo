package entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product() {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void setName (String name){
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double totalValueInStock(){
        return price * quantity;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }



    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", price= $ " + String.format("%.2f", price) +
                ", quantity= " + quantity +

                " unidades, Total: $ "+
                String.format("%.2f", totalValueInStock());
    }

}