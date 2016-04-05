package entities;

/**
 * Created by amam2 on 28/03/16.
 */
public class Login {

    private String userName;
    private long password;
    private boolean isLogin;
// CTORS
    public Login(String userName, long password, boolean isLogin) {
        this.userName = userName;
        this.password = password;
        this.isLogin = isLogin;
    }

    public Login() {
        this.userName = "";
        this.password = 0;
        this.isLogin = false;
    }
//Getters & Setters
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getPassword() {
        return password;
    }
    public void setPassword(long password) {
        this.password = password;
    }
// Methoed
    public boolean isLogin() {
        return isLogin;
    }// Check if customer Log In
    public void setLogin(boolean login) {
        isLogin = login;
    }
// ToString Methoed
    @Override
    public String toString() {
        return "Login{" +
                "userName='" + userName + '\'' +
                ", password=" + password +
                ", isLogin=" + isLogin +
                '}';
    }
}
