package backend;
import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class StudentBookDatabase extends DataBase {

    public StudentBookDatabase(String filename) {
        super.setFilename(filename);
    }

    public StudentBookDatabase() {
    }

    @Override
    public allRecords createRecordFrom(String line) {
        String[] sB = line.split(",");
        return new StudentBook(sB[0], sB[1], LocalDate.parse(sB[2]));
    }

}