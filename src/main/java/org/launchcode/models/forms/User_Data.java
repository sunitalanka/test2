package org.launchcode.models.forms;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class User_Data {


    @Id
    @GeneratedValue
    private int id;


    @NotNull
    @Size(min=3, max=15,message = "Login Id cannot be empty")
    private String loginId;

    @NotNull
    @Size(min=3, max=15)
    private String userPwd;

    private String firstName;

    private String lastName;

    private Character is_admin;

    public User_Data() {

    }


    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }


    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Character getIs_admin() {
        return is_admin;
    }

    public void setIs_admin(Character is_admin) {
        this.is_admin = is_admin;
    }

}


