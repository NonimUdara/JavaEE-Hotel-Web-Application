/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Nonim
 */
public class LoginPage {
    
    String uname;
    String fname;
    String lname;
    String nic;
    String address;
    String gender;
    String phone;
    String email;
    String nationality;
    String pass;
    
    public LoginPage(){
    
    }
    
    public LoginPage(String uname, String fname, String lname, String nic, String address, String gender, String phone, String email, String nationality, String pass){
        this.uname= uname;
        this.fname= fname;
        this.lname= lname;
        this.nic=nic;
        this.address=address;
        this.gender= gender;
        this.phone= phone;
        this.email= email;
        this.nationality= nationality;
        this.pass=pass;
    }
    
    public String getUsername(){
        return uname;
    }
    public void setUsername(String uname){
       this.uname= uname;
    }
    
    public String getfirstName(){
        return fname;
    }
    public void setfirstName(String fname){
        this.fname=fname;
    }
    
    public String getlastName(){
        return lname;
    }
    public void setlastName(String lname){
        this.lname=lname;
    }
    
    public String getNICNumber(){
        return nic;
    }
    public void setNICNumber(String nic){
        this.nic=nic;
    }
    
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    
    
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
       this.email= email;
    }
    
    public String getNationality(){
        return nationality;
    }
    public void setNationality(String nationality){
        this.nationality=nationality;
    }
    
    public String getPassword(){
        return pass;
    }
    public void setPassword(String pass){
       this.pass= pass;
    }
    
    
}