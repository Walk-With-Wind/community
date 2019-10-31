package life.kung_fu.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloController {

    @GetMapping("/hello")
    public String HelloWorld(@RequestParam(name = "name") String name , Model model){
        model.addAttribute("my_name" , name);
        return "hello";
    }
}
