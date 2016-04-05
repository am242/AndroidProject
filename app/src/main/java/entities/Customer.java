package entities;

/**
 * Created by am2 ${ibuktshin} on 19/03/2016.
 */
public class Customer extends Person {

    private long customerId;
    public static int customerCounter = 4000;
//CTORS
    public Customer(String address, String fName, int id, String lName, int password, int phoneNumber, String userName) {
        super(address, fName, id, lName, password, phoneNumber, userName);
        this.setCustomerId();
    }

    public Customer() {}
//Getters & Setters
    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId() {
        this.customerId = customerCounter++;
    }
//Equals Methoed
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Customer customer = (Customer) o;

        return customerId == customer.customerId;

    }
//ToString Methoed
    @Override
    public String toString() {
        return "Entities.Customer{" +
                "customerId=" + customerId +
                '}';
    }
}