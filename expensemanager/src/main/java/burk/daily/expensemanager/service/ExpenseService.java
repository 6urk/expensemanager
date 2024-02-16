package burk.daily.expensemanager.service;

import burk.daily.expensemanager.dto.ExpensesDTO;
import burk.daily.expensemanager.entity.Expense;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import burk.daily.expensemanager.repository.ExpenseRepository;

import java.util.List;
import java.util.stream.Collectors;
@Service
@RequiredArgsConstructor
public class ExpenseService {

    private final ExpenseRepository expenseRepository;
    private final ModelMapper modelMapper;


    public List<ExpensesDTO> getAllExpenses() {
        List<Expense> list = expenseRepository.findAll();
        List<ExpensesDTO> expenseList = list.stream().map(this::mapToDTO).collect(Collectors.toList());
        return expenseList;
    }

    private ExpensesDTO mapToDTO(Expense expense) {
        ExpensesDTO ExpensesDTO = modelMapper.map(expense, ExpensesDTO.class);
        return ExpensesDTO;
    }
}

