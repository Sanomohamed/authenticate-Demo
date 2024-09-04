public class Users {
    public final static int Stat_auth=1,stat_no_auth=0;
    private String username;
    private String password;
    private String email;
    private int status;

    public Users(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.status = stat_no_auth;
    }

    public boolean authenticate (Users user){
        boolean auth=false;
        if(username.equals(user.getUsername())&& password.equals(user.getPassword())){
            auth=true;
            user.setStatus(Stat_auth) ;
        }
        return auth;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
