import java.util.List;  
import java.util.ArrayList;  
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
@ManagedBean
@RequestScoped
public class UserBean {
 private String firstName;
    private String lastName;
    private String gender;
    private String userID;
    private String password;
    private String confirmPassword;
    private String FinalPassword;
    
    public List<RegistrationBean> productsList;  
public List<RegistrationBean> getProductList() {    
productsList = new ArrayList<>();    
productsList.add(new RegistrationBean(""+firstName+"",""+lastName+"",""+userID +"",""+ password+"",""+confirmPassword +""));     
return productsList;  
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

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
    
}
