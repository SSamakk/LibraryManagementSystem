package backend;
import constants.FileNames;

import java.util.ArrayList;

public class BookDatabase extends DataBase{
    private ArrayList<Book> records;
    private String filename;

    public BookDatabase (String filename)
    {
        super(FileNames.BOOKS_FILENAME);
        this.filename=filename;
    }

    @Override
    public allRecords createRecordFrom(String line) {
        String[] bookData = line.split(",");
        return new Book(bookData[0], bookData[1], bookData[2], bookData[3], Integer.parseInt(bookData[4]));
    }
}
