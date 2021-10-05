package comp.comp152;

import java.util.ArrayList;

public class Customer {
    private static int count = 0;
    private ArrayList<ShippingAddress> Addresses;
    private String Name;
    private int cutomerID;

    public Customer(String name) {
        Name = name;
        Addresses = new ArrayList<ShippingAddress>();
        cutomerID = count++;
    }
    public String getName() {
        return Name;
    }
    public void addAddress(ShippingAddress newAddress) {
        Addresses.add(newAddress);
    }
    @Override
    public String toString() {
        return "Customers [Addresses=" + Addresses + ", Name=" + Name + ", cutomerID=" + cutomerID + "]";
    }


    public ArrayList<ShippingAddress> getAddresses() {
        return Addresses;
    }
}
