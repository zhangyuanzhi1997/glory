package glory.Controllers;

import glory.Models.LoginRequestDto;
import glory.Repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserRepository userRepol;

    @PostMapping("/login")
    public boolean login(@RequestBody LoginRequestDto info) {
        return userRepol.existsUserByUsernameAndPassword(info.username, info.password);
    }


}
