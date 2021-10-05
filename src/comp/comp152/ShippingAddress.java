package comp.comp152;
public class ShippingAddress {
    private String AddressLine1;
    private String AddressLine;
    private String City;
    private String State;
    private String PostalCode;

    public ShippingAddress(String addressLine1, String addressLine, String city, String state, String postalCode) {
        AddressLine1 = addressLine1;
        AddressLine = addressLine;
        City = city;
        State = state;
        PostalCode = postalCode;
    }

    @Override
    public String toString() {
        return "ShippingAddress [AddressLine1=" + AddressLine1 + ", AddressLine=" + AddressLine + ", City=" + City
                + ", State=" + State + ", PostalCode=" + PostalCode + "]";
    }

}
