package glory.Controllers;


import glory.Models.User;
import glory.Models.LoginRequestDto;
import glory.Models.SetRegisterDto;
import glory.Repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserRepository userRepol;


    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    //登录页面
    @PostMapping("/login")
    public String login(@RequestBody LoginRequestDto info) {
        User userEnity = userRepol.findByUsernameAndPassword(info.username, info.password);
        String str = "";
        if (userEnity != null) {
            str = "index";
        } else {
            str = "login";
        }
        return str;
    }

    //注册页面
//    @RequestMapping("/setregister")
//    public String setregister(){
//        return "setregister";
//    }
    @PostMapping("/addregister")
    public String addregister(@RequestBody SetRegisterDto info) {
        long id = info.id;
        String username = info.username;
        String password = info.password;
        User userEntity = new User();
        if (userRepol.existsUserByUsernameAndPassword(username,password)!=true) {
            userEntity.setId(id);
            userEntity.setName(username);
            userEntity.setPassword(password);
            userRepol.save(userEntity);
            return "index";
        } else {
            return "login";
        }
    }
}
