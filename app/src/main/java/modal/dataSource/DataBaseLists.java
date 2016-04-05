package modal.dataSource;
import entities.*;


import modal.Backend.Backend;

import java.util.ArrayList;

/**
 * Created by אריאל on 20/03/16.
 */
public class DataBaseLists implements Backend {

    // Lists - DataBase
    ArrayList<Supplier> supplierList = new ArrayList<Supplier>();
    ArrayList<Book> bookList = new ArrayList<Book>();
    ArrayList<Order> orderList = new ArrayList<Order>();
    ArrayList<Customer> customerList = new ArrayList<Customer>();
    ArrayList<TrailBook> trailBooksList = new ArrayList<TrailBook>();
    ArrayList<SupplierBook> supplierBookList = new ArrayList<SupplierBook>();
    ArrayList<BookRanking>bookRankingList = new ArrayList<BookRanking>();



    //Adds
    @Override
    public void addSupplierBook(SupplierBook supplierBook) throws Exception {
        Book book ;
        Supplier supplier;
        for (Book b : bookList ) {
            if(b.getBookId() == supplierBook.getBookId())
                for (Supplier s : supplierList) {
                    if(s.getSupplierId() == supplierBook.getSupplierId())
                        for (SupplierBook sB: supplierBookList)
                        {
                            if(sB.equals(supplierBook))
                                throw new Exception("This book are arrive in this supplier") ;
                        }
                    else {throw new Exception("supplier Id wrong");}
                }
           else{ throw new Exception("book Id wrong");}
        }
        supplierBookList.add(supplierBook);
    }

    @Override
    public void addSupplier(Supplier supplier) throws Exception {
        for (Supplier s:supplierList)
        {
        if (s.equals(supplier)) throw new Exception("This supplier are arrive");
        }
        supplierList.add(supplier);
    }

    @Override
    public void addBook(Book book,String user, int password) throws Exception {
        if(checkingSupplierPassword(user,password)){
            for (Book b:bookList) {
                if (b.equals(book))throw new Exception("This book are arrive") ;
            }
            bookList.add(book);
        }
      else {throw new Exception("Supplier doesn't found for this Login info");}
    }

    @Override
    public void addCustomer(Customer customer) throws Exception {
        for (Customer c: customerList)
        {
            if (c.equals(customer)) throw new Exception("This customer are arrive");
        }
    customerList.add(customer);
    }

    @Override
    public void addOrder(Order order) throws Exception {
        for (Order o: orderList)
        {
            if (o.equals(order)) throw new Exception("This Entities.Order are arrive");
        }
        orderList.add(order);
    }

    @Override
    public void addBookRanking(BookRanking bookRanking) throws Exception {

        Book tBook = new Book();
        for (Book b : bookList) {
            if(b.getBookId()== bookRanking.getBookId());
            tBook = b;
        }
        if (tBook.getBookId() != 0)
            bookRankingList.add(bookRanking);
        throw new Exception("Invalid Entities.Book ID");
    }

    @Override
    public void addTrailBook(TrailBook trailBook) throws Exception {
        for (TrailBook t: trailBooksList)
        {
            if (t.equals(trailBook)) throw new Exception("This Trail are arrive");
        }
        trailBooksList.add(trailBook);
    }

    //Deletes

    @Override
    public void deleteSupplier(long supplierId) throws Exception {
        deleteConnectorSupplierBookBySupplier(supplierId);
        for (Supplier s:supplierList)
        {
         if (s.getSupplierId() == supplierId)
         {
             supplierList.remove(s);
             return;
         }
         }
        throw new Exception("Not found supplier");
        }

    @Override
    public void deleteConnectorSupplierBookByBook(long bookId) throws Exception {
        for (SupplierBook sB:supplierBookList)
        {
         if(sB.getBookId() == bookId)
         {
             supplierBookList.remove(sB);
             return;
         }
         else {throw new Exception("Not found connector between Entities.Book & Suplier");}
        }

    }

    @Override
    public void deleteConnectorSupplierBookBySupplier(long supplierId) throws Exception {
        for (SupplierBook sB:supplierBookList)
        {
            if(sB.getSupplierId() == supplierId)
            {
                supplierBookList.remove(sB);
                return;
            }
        }
        throw new Exception("Not found connector between Entities.Book & Suplier");
    }

    @Override
    public void deleteBook(long bookId) throws Exception {
        deleteConnectorSupplierBookByBook(bookId);
        for (Book b: bookList)
        {
            if (b.getBookId() == bookId)
            {
                bookList.remove(b);
                return;
            }
        }
        throw new Exception("Not found Entities.Book");
    }

    @Override
    public void deleteCustomer(long customerId) throws Exception {
        for (Customer c: customerList)
        {
            if (c.getCustomerId() == customerId) customerList.remove(c);
            return;
        }
        throw new Exception("Not found Entities.Customer");
    }

    @Override
    public void deleteOrder(long orderId) throws Exception {
        for (Order o: orderList)
        {
            if (o.getOrderId() == orderId) orderList.remove(o);
            return;
        }
        throw new Exception("Not found Entities.Order");
    }

    @Override
    public void deleteBookRanking(BookRanking bookRanking) throws Exception {

    }

    @Override
    public void deleteTrailBook(long trailId) throws Exception {
        for (TrailBook t: trailBooksList)
        {
            if (t.gettBookId() == trailId) trailBooksList.remove(t);
            return;
        }
        throw new Exception("Not found Trail Entities.Book");
    }

    //Updates
    @Override
    public void updateBookToSupplier(SupplierBook supplierBook) throws Exception {
        for (SupplierBook sB: supplierBookList)
        {
            if (sB.getBookId() == supplierBook.getBookId() && sB.getSupplierId() == supplierBook.getSupplierId())
                supplierBookList.remove(sB);
                supplierBookList.add(supplierBook);
            return;
        }
        throw new Exception("Not found Connector between Entities.Supplier & Entities.Book");
    }

    @Override
    public void updateSupplier(Supplier supplier) throws Exception {
        for (Supplier s: supplierList)
        {
            if (s.getSupplierId() == supplier.getSupplierId())
            {
                supplierList.remove(s);
                supplierList.add(supplier);
                return;
            }
            throw new Exception("Not found Entities.Supplier to update");

        }
        return;
    }

    @Override
    public void updateBook(Book book) throws Exception {
        for (Book b: bookList) {
            if (b.getBookId() == book.getBookId())
            {
                bookList.remove(b);
                bookList.add(book);
                return;
            }
            throw new Exception("Not found Entities.Book to update");
        }
        }

    @Override
    public void updateCustomer(Customer customer) throws Exception {
        for (Customer c: customerList)
        {
            if (c.getCustomerId() == customer.getCustomerId())
            {
                customerList.remove(c);
                customerList.add(customer);
                return;
            }

        }
        throw new Exception("Not found Entities.Customer to update");
    }

    @Override
    public void updateOrder(Order order) throws Exception {
        for (Order o: orderList)
        {
            if (o.getOrderId() == order.getOrderId())
            {
                orderList.remove(o);
                orderList.add(order);
                return;
            }
            throw new Exception("Not found Entities.Book to update");
        }
        return;
    }

    @Override
    public void updateBookRanking(BookRanking bookRanking) throws Exception {

    }

    @Override
    public void updateTrailBook(TrailBook trailBook) throws Exception {
        for (TrailBook t: trailBooksList)
        {
            if (t.gettBookId() == trailBook.gettBookId()) {
                trailBooksList.remove(t);
                trailBooksList.add(trailBook);
                return;
            }
        }
        throw new Exception("Not found Entities.Book Trail to update");
    }

    //Funcs
    @Override
    public ArrayList<Book> getBookListByAuthorName(String authorName) throws Exception {
        ArrayList<Book> bookListByAuthor = new ArrayList<Book>();
        for (Book b: bookList)
        {
            if (b.getAuthorName() == authorName);
            bookListByAuthor.add(b);
        }
        return bookListByAuthor;
    }

    @Override
    public ArrayList<Book> getBookList() throws Exception {
        if (bookList.size() != 0) return bookList;
        else
            throw new Exception("Not found Books");
    }

    @Override
    public ArrayList<Supplier> getSupplierList() throws Exception {
        if (supplierList.size() != 0) return supplierList;
        else
            throw new Exception("Not found Entities.Supplier");
    }

    @Override
    public ArrayList<Book> getBookListByScore(int score) throws Exception {

        ArrayList<Book>tBookList = new ArrayList<Book>();
        for (BookRanking br : bookRankingList) {
            if(br.getScore().Value == score)
                tBookList.add(getBookByID(br.getBookId()));
        }
        if(tBookList.size() == 0)
            throw new Exception("There isn't books whid score"+" "+ score);
        return tBookList;
    }

    @Override
    public ArrayList<Book> getBookListBySupplierId(int supplierId) throws Exception {
        ArrayList<Book> bookListBySupplier = new ArrayList<Book>();
        for (SupplierBook b: supplierBookList)
        {
            if (b.getSupplierId() == supplierId);
                int bookId = b.getBookId();
                bookListBySupplier.add(getBookByID(bookId));
        }
        return bookListBySupplier;
    }

    @Override
    public ArrayList<TrailBook> getTrailBookListByCustomer(int customerId) throws Exception {
        return null;
    }

    @Override
    public Book getBookByID(int bookID)throws Exception{
        for (Book b : bookList){
            if(b.getBookId() == bookID);
            return b;
        }
        throw new Exception("Entities.Book not fownd");
    }
    @Override
    public Supplier getSuplierByID(int suplierID)throws Exception{
        for (Supplier s : supplierList){
            if(s.getSupplierId() == suplierID);
            return s;
        }
        throw new Exception("Entities.Book not fownd");
    }

    @Override
    public ArrayList<Order> getOrderList() throws Exception {
        if (orderList.size() != 0) return orderList;
        else
            throw new Exception("Not found Orders");
    }

    @Override
    public Boolean checkingCustomerPassword(String userName, int password) throws Exception {
        for (Customer c:customerList) {
            if(c.getUserName() == userName && c.getPassword() == password)
                return true;
        }
        return false;
    }
    @Override
    public Boolean checkingSupplierPassword(String userName, int password) throws Exception {
        for (Supplier s: supplierList) {
            if( s.getPassword() == password && s.getUserName().equals(userName) )
                return true;
        }
        return false;
    }

    @Override
    public ArrayList<Supplier> getSulierListByBookId(int bookId) throws Exception {
        ArrayList<Supplier> supplierListByBook = new ArrayList<Supplier>();
        for (SupplierBook s: supplierBookList ) {
            if (s.getBookId() == bookId) {
                supplierListByBook.add(getSuplierByID(s.getSupplierId()));
            }
            else if(supplierListByBook.size() == 0) {
                throw new Exception("There is no supplier for this book");
            }
        }
        return supplierListByBook;
    }

    @Override
    public long getCustomerIdByUserLogIn (String user) throws Exception {
        for (Customer c: customerList)
        {
            if (c.getUserName().equals(user)) return c.getCustomerId();
        }
        throw new Exception("Customer Id not found");
    }

    @Override
    public ArrayList<String> getAllBookCategory() throws Exception {
        ArrayList<String> tempList = new ArrayList<String>();
        for (int i = 1; i < BookCategory.values().length; i++) {
                tempList.add(i+") "+(String)BookCategory.values()[i].toString());
        }
        return tempList;
    }
    @Override
    public ArrayList<Book> getBookListByCategory(int categoryNumber) throws Exception {
        ArrayList<Book> bookListByCategory = new ArrayList<Book>();
        for (Book b:bookList) {
            if (b.getBookCategory() == BookCategory.values()[categoryNumber])
            {
                bookListByCategory.add(b);
            }
            return  bookListByCategory;
        }
        throw new Exception("not found Book Category");
    }

    @Override
    public int getPriceBookByBookId(int bookid) throws Exception {
        for (SupplierBook b: supplierBookList)
        {
         if(b.getBookId() == bookid){return  b.getBookCost();}
        }
        throw new Exception("Not found Book");
    }

    @Override
    public Customer getCustomerByID (long customerID) throws Exception {
        for (Customer c:customerList)
        {
         if (c.getCustomerId() == customerID) return c;
        }
        throw new Exception("Customer not found");
    }
}