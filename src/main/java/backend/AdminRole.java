package backend;
import constants.FileNames;

public class AdminRole extends LibrarianUserDatabase{

    private LibrarianUserDatabase database = new LibrarianUserDatabase(FileNames.LIBRARIANS_FILENAME);

    public AdminRole() {
        super(FileNames.LIBRARIANS_FILENAME);
        database.readFromFile();
    }

    public void addLibrarian(String librarianId, String name, String email, String address, String phoneNumber) {
        
        LibrarianUser user = new LibrarianUser(librarianId, name, email, address, phoneNumber);
        database.insertRecord(user);
    }

    public LibrarianUser[] getListOfLibrarians()
    {
        LibrarianUser[] user = new LibrarianUser[database.returnAllRecords().size()];
        return database.returnAllRecords().toArray(user);
    }

    public void removeLibrarian(String key)
    {
        database.deleteRecord(key);
    }
    public void logout()
    {
        database.saveToFile();
    }
}

