

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
/**
 *
 * @author User
 */
@ManagedBean 
@RequestScoped
//@Dependent
public class LoginBean {
    @NotNull(message = "Name cannot be null")
    private String username;
    
    @Size(min = 8, max = 20 , message ="password must be of 8 characters")
    private String password;

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

    /**
     * Creates a new instance of LoginBean
     */
}
