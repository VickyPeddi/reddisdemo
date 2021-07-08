package first.reddisdemo.controller;

import first.reddisdemo.model.User;
import first.reddisdemo.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Usercontroller {



    @RequestMapping("/")
    public ResponseEntity<String> saveuser(@RequestBody User user)
    {


        return ResponseEntity.ok("");
    }


}
