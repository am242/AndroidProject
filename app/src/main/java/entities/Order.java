package entities;

import java.io.Serializable;

/**
 * Created by ${ibuktshin} on 20/03/2016.
 */
public class Order implements Serializable {
    public static int orderCounter = 3000;
    private long orderId;
    private long bookNumber;
    private long customerId;
    private long supplierId;
//Ctors
    public Order(long bookNumber, long customerId, long supplierId) {
        this.bookNumber = bookNumber;
        this.customerId = customerId;
        this.setOrderId();
        this.supplierId = supplierId;
    }
    public Order() {
        this.bookNumber = 0;
        this.customerId = 0;
        this.orderId = 0;
        this.supplierId = 0;
    }
// Getters & Setters
    public long getBookNumber() {
        return bookNumber;
    }
    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

    public long getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public long getOrderId() {
        return orderId;
    }
    public void setOrderId() {
        this.orderId = orderCounter++;
    }

    public long getStoreID() {
        return supplierId;
    }
    public void setStoreID(int storeID) {
        this.supplierId = storeID;
    }
// ToString Methoed
    @Override
    public String toString() {
        return "Entities.Order{" +
                "bookNumber=" + bookNumber +
                ", orderId=" + orderId +
                ", customerId=" + customerId +
                ", storeID=" + supplierId +
                '}';
    }
//Equals Methoed
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Order order = (Order) obj;
        if (orderId != order.orderId) return false;
        if (bookNumber != order.bookNumber) return false;
        if (customerId != order.customerId) return false;
        return supplierId == order.supplierId;
    }
}
