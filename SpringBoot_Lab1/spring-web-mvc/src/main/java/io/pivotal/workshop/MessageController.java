package io.pivotal.workshop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MessageController {

    @GetMapping("/message")
    public ModelAndView message() {

        ModelAndView model = new ModelAndView("message");
        model.addObject("message", "This is a Spring MVC App");
	model.setViewName("message");
        return model;
    }
}
