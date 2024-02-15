package service;

import dto.ExpensesDTO;
import entity.Expense;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ExpenseRepository;

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

