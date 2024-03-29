package bd.edu.seu.project_login.ragi_vlaues;

public class Values {
    private String fullname;
    private String username;
    private String password;
    private String email;
    private String address;
    private int ID;

    public Values(int ID, String fullname, String username, String password, String email, String address) {
        this.fullname = fullname;
        this.username = username;
        this.password = password;
        this.email = email;
        this.address = address;
        this.ID = ID;
    }

    public Values(String fullname, String username, String password, String email, String address) {
        this.fullname = fullname;
        this.username = username;
        this.password = password;
        this.email = email;
        this.address = address;
    }

    public Values() {
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
