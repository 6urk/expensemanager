package burk.daily.expensemanager.controller;

import burk.daily.expensemanager.dto.ExpensesDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import burk.daily.expensemanager.service.ExpenseService;

import java.math.BigDecimal;
import java.sql.Date;

@Controller
@RequiredArgsConstructor
public class ExpenseController {

    private final ExpenseService expenseService;
    static{
        ExpensesDTO expense = new ExpensesDTO();
        expense.setName("water bill");
        expense.setDescription("water bill for the month of june");
        expense.setAmount(new BigDecimal(700.00));
        expense.setDate(new Date(System.currentTimeMillis()));



        expense.setName("power bill");
        expense.setDescription("power bill for the month of june");
        expense.setAmount(new BigDecimal(100.00));
        expense.setDate(new Date(System.currentTimeMillis()));

    }
    @GetMapping("/expenses")
    public String showExpenseList(Model model) {
        model.addAttribute("expenses", expenseService.getAllExpenses());
        return "expenses-list";
    }
}




// Path: expensemanager/src/main/resources/templates/expenses-list.html