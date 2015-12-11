package PostBored;

/**
 *
 */
public class Member {

    private int id;
    private String username;
    private String email;
    private String password;

    public Member() {
        this.id = 0;
        this.username = "";
        this.email = "";
        this.password = "";
    }

    public Member(String memberUsername, String memberEmail, String memberPassword) {
        this.id = id;
        this.username = memberUsername;
        this.email = memberEmail;
        this.password = memberPassword;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
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
}
