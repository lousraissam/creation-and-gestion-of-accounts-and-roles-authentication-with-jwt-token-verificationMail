package com.bezkoder.springjwt.payload.request;

import java.util.Date;
import java.util.Set;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.*;
 
public class SignupRequest {
    @NotBlank
    @Size(min = 3, max = 20)
    private String username;
 
    @NotBlank
    @Size(max = 50)
    @Email
    private String email;

    @NotBlank
    @Size(min = 6, max = 40)
    private String password;

    @Temporal(TemporalType.DATE)
    private Date dateN;
     @NotBlank
    private String numTel;

    private Long sin;
    
    private Set<String> role;

  
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Date getDateN() {
        return dateN;
    }

    public void setDateN(Date dateN) {
        this.dateN = dateN;
    }


    public String getNumTel(){ return numTel;}
    public void setNumTel(String numTel){this.numTel=numTel;}

    public Long getSin(){ return sin;}
    public void setSin(Long sin){this.sin=sin;}
    

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<String> getRole() {
        return this.role;
    }

    public void setRole(Set<String> role) {
        this.role = role;
    }


}
