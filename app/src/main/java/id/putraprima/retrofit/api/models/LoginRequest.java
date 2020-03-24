package id.putraprima.retrofit.api.models;

public class LoginRequest {
    public String email,password;

    public LoginRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
