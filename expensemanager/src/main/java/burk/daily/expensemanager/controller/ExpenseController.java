package burk.daily.expensemanager.controller;

import burk.daily.expensemanager.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ExpenseController {



    private final ExpenseService expenseService;



    @GetMapping("/expenses")
    public String showExpenseList(Model model) {
        model.addAttribute("list", expenseService.getAllExpenses());
        return "expenses-list";

    }
}
// Path: expensemanager/src/main/resources/templates/expenses-list.html