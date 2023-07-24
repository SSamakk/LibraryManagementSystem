package backend;
import java.time.LocalDate;

public class StudentBook implements allRecords {
    private String studentId;
    private String bookId;
    private LocalDate borrowDate;
    public StudentBook(String studentId, String bookId, LocalDate borrowDate)
    {
        this.studentId=studentId;
        this.bookId=bookId;
        this.borrowDate=borrowDate;
    }
    public String getStudentId()
    {
        return this.studentId;
    }
    public String getBookId()
    {
        return this.bookId;
    }
    public LocalDate getBorrowDate()
    {
        return this.borrowDate;
    }

    public String lineRepresentation()
    {
        return (studentId+","+bookId+","+borrowDate);
    }
    public String getSearchKey()
    {
        return (studentId +","+bookId);
    }
}
