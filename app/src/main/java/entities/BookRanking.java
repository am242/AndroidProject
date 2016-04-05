package entities;

/**
 * Created by ${ibuktshin} on 19/03/2016.
 */
public class BookRanking  {

    private int bookId;
    private String rankerName;
    private Score score;
//CTORS

    public BookRanking(int bookId, String rankerName, Score score) {
        this.bookId = bookId;
        this.rankerName = rankerName;
        this.score = score;
    }
    public BookRanking() {
        this.bookId = 0;
        this.rankerName = "";
    }

//Getters & Setters

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getRankerName() {
        return rankerName;
    }

    public void setRankerName(String rankerName) {
        this.rankerName = rankerName;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

// ToString Methoed


    @Override
    public String toString() {
        return "BookRanking{" +
                "bookId=" + bookId +
                ", rankerName='" + rankerName + '\'' +
                ", score=" + score +
                '}';
    }

}
