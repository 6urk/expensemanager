package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExoenseControler {
    @GetMapping("/expenses")
    public String showExpenses(){
        return "expenses-list";
    }
}
