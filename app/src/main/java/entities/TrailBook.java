package entities;

/**
 * Created by אריam2אל on 20/03/16.
 */
public class TrailBook  {
    // Varibles
    private long tBookId;
    private int tValidBook;
    private long customerId;
    public static long trailBookCounter = 5000;
    private int bookId ;
   // Ctors
    public TrailBook( long customerId, int bookId) {
        this.settBookId();
        this.settValidBook();
        this.customerId = customerId;
        this.bookId =bookId;
    }
    public TrailBook() {
        this.tBookId = 0;
        this.customerId = 0;
        this.bookId =bookId;
    }
   // Getters & Setters
    public long gettBookId() {
        return tBookId;
    }
    public void settBookId() {
        this.tBookId = trailBookCounter++;
    }

    public int gettValidBook() {
        return tValidBook;
    }
    public void settValidBook() {
        this.tValidBook = 7;
    }

    public long getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    // Equals Methoed
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrailBook trailBook = (TrailBook) o;

        if (tBookId != trailBook.tBookId) return false;
        if (tValidBook != trailBook.tValidBook) return false;
        if (customerId != trailBook.customerId) return false;
        return bookId == trailBook.bookId;

    }

   // ToString Methoed
    @Override
    public String toString() {
        return "Entities.TrailBook{" +
                "tBookId=" + tBookId +
                ", tValidBook='" + tValidBook + '\'' +
                ", customerId=" + customerId +
                '}';
    }
}