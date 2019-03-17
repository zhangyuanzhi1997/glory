package glory.Repositorys;


import glory.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends JpaRepository<User, Long> {
   boolean existsUserByUsernameAndPassword(String username, String password);
     User findByUsernameAndPassword(String username,String password);
     //User findByUsername(String username);
}
