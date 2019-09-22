package naksoo.mp3tagmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @RequestMapping("")
    public String getMain(){

        ModelAndView mv = new ModelAndView();
        mv.setViewName("templates/view/index");
        return "index";

    }
}
