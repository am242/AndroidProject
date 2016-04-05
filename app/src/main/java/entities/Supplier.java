package entities;

/**
 * Created by אריא am2ל on 20/03/16.
 */
public class Supplier extends Person {
    // Varibles
    private long supplierId;
    public static int supplierCounter = 1000;
   // Ctors
    public Supplier(String address, String fName, int id, String lName, int password, int phoneNumber, String userName) {
        super(address, fName, id, lName, password, phoneNumber, userName);
       this.setSupplierId();
    }
    public Supplier() {}
    // Getters & Setters
    public long getSupplierId() {
        return supplierId;
    }
    public void setSupplierId() {
        this.supplierId = supplierCounter++;
    }
   // Equals Methoed
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Supplier supplier = (Supplier) o;

        return supplierId == supplier.supplierId;

    }
  // ToString Methoed
    @Override
    public String toString() {
        return "Entities.Supplier{" +
                "supplierId=" + supplierId +
                "First Name=" + getfName() +
                '}';
    }
}
