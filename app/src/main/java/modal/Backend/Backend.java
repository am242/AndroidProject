package modal.Backend;
import entities.*;


import java.util.ArrayList;

/**
 * Created byam2 אריאל on 20/03/16.
 */
public interface Backend {
    // Add Methoeds
    public void addSupplier(Supplier supplier) throws Exception;
    public void addBook(Book book, String user, int password) throws Exception;
    public void addCustomer(Customer customer) throws Exception;
    public void addOrder(Order order) throws Exception;
    public void addBookRanking(BookRanking bookRanking) throws Exception;
    public void addTrailBook(TrailBook trailBook) throws Exception;
    public void addSupplierBook(SupplierBook supplierBook) throws Exception;
    // Delete Methoeds
    public void deleteSupplier(long supplierId) throws Exception;
    public void deleteBook(long bookId) throws Exception;
    public void deleteCustomer(long customerId) throws Exception;
    public void deleteOrder(long orderId) throws Exception;
    public void deleteBookRanking(BookRanking bookRanking) throws Exception;
    public void deleteTrailBook(long trailBookId) throws Exception;
    public void deleteConnectorSupplierBookByBook(long bookId) throws Exception;
    public void deleteConnectorSupplierBookBySupplier(long supplierId) throws Exception;
 // Update Methoeds
    public void updateSupplier(Supplier supplier) throws Exception;
    public void updateBook(Book book) throws Exception;
    public void updateCustomer(Customer customer) throws Exception;
    public void updateOrder(Order order) throws Exception;
    public void updateBookRanking(BookRanking bookRanking) throws Exception;
    public void updateTrailBook(TrailBook trailBook) throws Exception;
    public void updateBookToSupplier(SupplierBook supplierBook) throws Exception;

 // Reports Methoeds
    public ArrayList<Book> getBookListByAuthorName(String authorName) throws Exception;
    public ArrayList<Order> getOrderList() throws Exception;
    public ArrayList<Book> getBookListByScore(int score) throws Exception;
    public ArrayList<Book> getBookListByCategory(int categoryNumber) throws Exception;
    public ArrayList<Book> getBookListBySupplierId(int supplierId) throws Exception;
    public ArrayList<Supplier> getSulierListByBookId(int bookId) throws Exception;
    public ArrayList<String> getAllBookCategory() throws Exception;
    public ArrayList<TrailBook> getTrailBookListByCustomer(int customerId) throws Exception;
    public ArrayList<Book> getBookList() throws Exception;
    public ArrayList<Supplier> getSupplierList() throws Exception;
   // Help methoed
    public Book getBookByID(int bookID) throws Exception;
    public Boolean checkingCustomerPassword(String userName, int password) throws Exception;
    public long getCustomerIdByUserLogIn(String user) throws Exception;
    public Supplier getSuplierByID(int suplierID)throws Exception;
    public Boolean checkingSupplierPassword(String userName, int password) throws Exception;
    public Customer getCustomerByID(long customerID) throws Exception;
    public int getPriceBookByBookId(int bookid) throws Exception;
}
