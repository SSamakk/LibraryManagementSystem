package backend;
import constants.FileNames;

import java.util.ArrayList;

public class LibrarianUserDatabase extends DataBase{

    private ArrayList<LibrarianUser> records;
    private String filename;

    public LibrarianUserDatabase(String filename)
    {
        super(FileNames.LIBRARIANS_FILENAME);
        this.filename=filename;
    }
    @Override
    public allRecords createRecordFrom(String line) {
        String[] user = line.split(",");
        return new LibrarianUser(user[0], user[1], user[2], user[3], user[4]);
    }
}
