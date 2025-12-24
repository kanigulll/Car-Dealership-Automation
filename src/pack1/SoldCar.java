package pack1;

public class SoldCar {
    private int id;  // Auto increment ID için
    private Car car;
    private Customer customer;
    private double salePrice;

    public SoldCar(Car car, Customer customer, double salePrice) {
        this.car = car;
        this.customer = customer;
        this.salePrice = salePrice;
    }

    // id'yi constructor ile istersen ekleyebilirsin ya da setter/getter kullan
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Car getCar() {
        return car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getSalePrice() {
        return salePrice;
    }
}



