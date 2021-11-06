package buildUI;

public class Account {
    // Thuoc tinh
    private String userName;
    private String password;
    private String access;

    // Ham khoi tao khong tham so
    public Account(){
        userName="";
        password="";
        access="";
    }

    // Ham khoi tao co doi so
    public Account(String userName, String password, String access){
        this.userName=userName;
        this.password=password;
        this.access=access;
    }

    // Cac ham getter va setter
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }
}

