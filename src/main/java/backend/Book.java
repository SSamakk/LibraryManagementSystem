package backend;
public class Book implements allRecords {
    private String bookId;
    private String title;
    private String authorName;
    private String publisherName;
    private int quantity;

    public Book (String id, String title, String authorName, String publisherName, int quantity)
    {
        this.bookId=id;
        this.title=title;
        this.authorName=authorName;
        this.publisherName=publisherName;
        this.quantity=quantity;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public String lineRepresentation()
    {
        return (bookId+","+title+","+authorName+","+publisherName+","+quantity);
    }
    public String getSearchKey()
    {
        return bookId;
    }
}
