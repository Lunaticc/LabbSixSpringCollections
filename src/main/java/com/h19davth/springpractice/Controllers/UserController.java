package com.h19davth.springpractice.Controllers;

import com.h19davth.springpractice.Objects.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    List<User> userList = List.of(
            new User("user", 26, "https://www.landezine.com/wp-content/uploads/2013/05/02_BRF_paving-rain-250x150.jpg"),
            new User("user2", 28, "https://i.pinimg.com/originals/7f/02/77/7f0277f633e1b829cb8377a9ae0a58da.jpg"),
            new User("user3", 30, "https://www.sporthoj.com/forum/attachment.php?attachmentid=373624&d=1353782610&thumb=1")
    );

    @RequestMapping("/usersapp")
    public String index(Model model) {
        model.addAttribute("users", userList);
        return "userapp";
    }


    @RequestMapping("/usersapp/viewuser/{id}")
    public String viewDetails(Model model, @PathVariable String id){
        model.addAttribute("user", userList.get(Integer.parseInt(id)-1));
        return "userview";
    }






}
