package spring.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import spring.service.MainService;

@Controller
@RequiredArgsConstructor
public class MainController {
    private final MainService mainService;

    @GetMapping("")
    public String index() {
        return "index";
    }

    @GetMapping("/hello")
    public String hello(Model model, String name) {
            model.addAttribute("message", mainService.hello(name));
        return "index";
    }

}
