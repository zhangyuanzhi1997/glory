package glory.Models;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "user_info")
@Component
public class User {

    public User() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String username;
    public String password;

}
