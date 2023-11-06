package homework.onlineShop.model;



public class User {

    private String id;
    private String name;
    private String email;
    private String password;
    private UserOrAdmin userOrAdmin;

    public User(String name, String email, String password, UserOrAdmin user) {
    }

    public User(String id, String name, String email, String password, UserOrAdmin userOrAdmin) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.userOrAdmin = userOrAdmin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserOrAdmin getUserOrAdmin() {
        return userOrAdmin;
    }

    public void setUserOrAdmin(UserOrAdmin userOrAdmin) {
        this.userOrAdmin = userOrAdmin;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", userOrAdmin=" + userOrAdmin +
                '}';
    }
}
