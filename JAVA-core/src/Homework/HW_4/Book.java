package Homework.HW_4;

public class Book {
    private int id;
    private String bookName;
    private String author;
    private String genre;
    private String publisher;
    private int yearPublish;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearPublish() {
        return yearPublish;
    }

    public void setYearPublish(int yearPublish) {
        this.yearPublish = yearPublish;
    }
    public Book() {
    }

    @Override
    public String toString() {
        return "" +
                "id = " + id +
                ", bookName = " + bookName +
                ", author = " + author +
                ", genre = " + genre +
                ", publisher = " + publisher +
                ", yearPublish = " + yearPublish ;
    }
    public String display(){
        return toString();
    }
}
