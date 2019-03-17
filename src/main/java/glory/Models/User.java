package glory.Models;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity(name = "user_info")
@Component
public class User {
    public User() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    public long id;
    public String username;
    public String password;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
   @Column(name="username")
    public String getName() {
        return username;
    }
    public void setName(String username) {
        this.username = username;
    }
   @Column(name="password")
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}
