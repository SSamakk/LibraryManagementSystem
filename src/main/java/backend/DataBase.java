package backend;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class DataBase{
    public String filename0;
    private ArrayList<allRecords> listRecord =new ArrayList<>();

    public DataBase(String filename)
    {
        this.filename0=filename;
    }
    public DataBase(){}
    public String getFilename() {
        return filename0;
    }

    public void setFilename(String filename) {
        this.filename0 = filename;
    }
    public void readFromFile()
    {
        try
        {
            File file = new File(this.filename0);
            Scanner s = new Scanner(file);
            while (s.hasNextLine())
            {
                listRecord.add(createRecordFrom(s.nextLine()));
            }
            s.close();
        }
        catch (FileNotFoundException s)
        {
            System.out.println("An error occurred.");
        }
    }
    public abstract allRecords createRecordFrom(String line);
    public ArrayList<allRecords> returnAllRecords()
    {
        return listRecord;
    }

    public boolean contains(String key) {

        return (getRecord(key) != null);
    }

    public allRecords getRecord(String key) {
        for (allRecords record : listRecord) {
            if (key.equals(record.getSearchKey())) {
                return record;
            }
        }
        return null;
    }

    public void insertRecord(allRecords record)
    {
        listRecord.add(record);
    }

    public void deleteRecord(String key)
    {
        allRecords user = getRecord(key);
        listRecord.remove(user);
    }

    public void saveToFile()
    {
        try
        {
            FileWriter file = new FileWriter (this.filename0,false);
            for (int i = 0; i < listRecord.size(); i++)
            {
                String newline = System.lineSeparator();
                file.write(listRecord.get(i).lineRepresentation()+newline);
            }
            file.close();
        }
        catch(IOException e)
        {
            System.out.println("An error occurred.");
        }
    }
}
