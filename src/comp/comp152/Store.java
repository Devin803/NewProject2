package comp.comp152;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Store {
    private ArrayList<Order> Orders;
    private ArrayList<Customer> Customers;
    private Scanner sc;
    private Object Addresses;

    public Store() {
        sc = new Scanner(System.in);
        Customers = new ArrayList<Customer>();
        Orders = new ArrayList<Order>();
        List<String> lines = Collections.emptyList();

    }

    public void runStore() {

        while(true) {
            System.out.println("MENU");
            System.out.println("1. Add Customer");
            System.out.println("2. Select Customer");
            System.out.print("Enter you choice : ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    addCustomer();
                    break;
                case 2:
                    manageCustomer(selectCustomer());
                    break;

                default:
                    System.exit(0);
            }
        }
    }

    public void makeOrder(ShippingAddress address, Customer cust) {
        Orders.add(new Order(address,cust));
    }

    public void addCustomer() {
        System.out.print("Enter Customer Name : ");
        String name = sc.next();
        Customer cust = new Customer(name);
        Customers.add(cust);
    }

    public Customer selectCustomer() {
        int i = 0;
        for(Customer cust : Customers) {
            System.out.println(i++ + " "+cust.getName());
        }
        System.out.print("Select Customer : ");
        int ch = sc.nextInt();
        return Customers.get(ch);
    }

    public void manageCustomer(Customer selectCustomer) {
        System.out.println("CUSTOMER MENU");
        System.out.println("1. Add Address");
        System.out.println("2. Make Order");
        System.out.print("Enter you choice : ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                String addressLine1 = "", addressLine2= "", city= "", state= "", postalCode="";
                System.out.println("Enter addressLine1");
                if(sc.hasNext()) {
                    sc.next();
                }
                addressLine1 = sc.next();
                System.out.println("Enter addressLine2");
                addressLine2 = sc.next();
                System.out.println("Enter city");
                city = sc.next();
                System.out.println("Enter state");
                state = sc.next();
                System.out.println("Enter postalCode");
                postalCode = sc.next();
                ShippingAddress newAddress = new ShippingAddress(addressLine1, addressLine2, city, state, postalCode);
                selectCustomer.addAddress(newAddress);
                System.out.println("Address added successfully!");
                break;
            case 2:
                ArrayList<ShippingAddress> addrs = selectCustomer.getAddresses();
                int i = 0;
                for(ShippingAddress addr : addrs) {
                    System.out.println(i++ +" "+addr);
                }
                System.out.print("Enter your choice : ");
                int c = sc.nextInt();
                makeOrder(addrs.get(c), selectCustomer);
                break;
            default:
                System.exit(0);
        }

    }

    public static void main(String[] args) {
        Store store = new Store();
        store.runStore();
    }
}