package comp.comp152;

public class Order {
    private ShippingAddress destination;
    private Customer orderBy;

    public Order(ShippingAddress destination, Customer orderBy) {
        super();
        this.destination = destination;
        this.orderBy = orderBy;
    }

    public String getDestination() {
        return destination.toString();
    }

    public String getOrderBy() {
        return orderBy.toString();
    }

}

