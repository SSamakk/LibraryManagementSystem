package backend;
public class LibrarianUser implements allRecords {
    private String librarianId;
    private String Name;
    private String Email;
    private String Address;
    private String PhoneNumber;

    public LibrarianUser(String librarianId, String name, String email, String address, String phoneNumber)
    {
        this.librarianId=librarianId;
        this.Name=name;
        this.Email=email;
        this.Address=address;
        this.PhoneNumber=phoneNumber;
    }

    public String lineRepresentation()
    {
        return (librarianId+","+Name+","+Email+","+Address+","+PhoneNumber);
    }
    public String getSearchKey()
    {
        return librarianId;
    }
        public String getLibrarianId() {
        return librarianId;
    }

    public void setLibrarianId(String librarianId) {
        this.librarianId = librarianId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.PhoneNumber = phoneNumber;
    }

}
