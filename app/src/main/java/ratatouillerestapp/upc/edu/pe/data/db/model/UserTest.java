package ratatouillerestapp.upc.edu.pe.data.db.model;

/**
 * Created by frank on 29/09/17.
 */

public class UserTest {




    private String email;
    private String password;


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

    @Override
    public String toString() {
        return "UserTest{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }



}
