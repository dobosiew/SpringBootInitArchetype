package ${package}.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String homeController(
            @RequestParam(value = "text", defaultValue = "Hello World", required = false) String text,
            Model model) {
        model.addAttribute("text", text);
        return "index";
    }
}
