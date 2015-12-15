package PostBored;

/**
 *
 */
class Member {

    private int id;
    private String username;
    private String email;
    private String password;

    public Member(int id, String memberUsername, String memberEmail, String memberPassword) {
        this.id = id;
        this.username = memberUsername;
        this.email = memberEmail;
        this.password = memberPassword;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
