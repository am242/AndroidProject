package entities;

import java.io.Serializable;

/**
 * Created by am2אריאל on 20/03/16.
 */
public class SupplierBook implements Serializable {
    //Varibles
    private int supplierId;
    private int bookId;
    private int supplierBookAmount;
    private int bookCost;

    //Ctors
    public SupplierBook(int supplierId, int bookId, int bookInventory, int bookCost) {
        this.supplierId = supplierId;
        this.bookId = bookId;
        this.supplierBookAmount = bookInventory;
        this.bookCost = bookCost;
    }
   // Getters & Setters
    public int getBookCost() {
        return bookCost;
    }
    public void setBookCost(int bookCost) {
        this.bookCost = bookCost;
    }

    public int getBookInventory() {
        return supplierBookAmount;
    }
    public void setBookInventory(int bookInventory) {
        this.supplierBookAmount = bookInventory;
    }

    public int getSupplierId() {
        return supplierId;
    }
    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    // ToString Methoed
    @Override
    public String toString() {
        return "Entities.SupplierBook{" +
                "bookCost=" + bookCost +
                ", supplierId=" + supplierId +
                ", bookId=" + bookId +
                ", bookInventory=" + supplierBookAmount +
                '}';
    }
   // Equals Methoed
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SupplierBook that = (SupplierBook) o;

        if (supplierId != that.supplierId) return false;
        return bookId == that.bookId;

    }

}
