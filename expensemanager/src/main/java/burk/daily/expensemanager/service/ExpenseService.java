package burk.daily.expensemanager.service;

import burk.daily.expensemanager.dto.ExpensesDTO;
import burk.daily.expensemanager.entity.Expense;
import burk.daily.expensemanager.util.DateTimeUtil;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import burk.daily.expensemanager.repository.ExpenseRepository;

import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;

//@Service
//@RequiredArgsConstructor
//public class ExpenseService {
//
//    private ExpenseRepository expenseRepository;
//    private final ModelMapper modelMapper;
//
//    public List<ExpensesDTO> getAllExpenses() {
//        List<Expense> list= expenseRepository.findAll();
//        return list.stream().map(this::mapToDTO).collect(Collectors.toList());
//    }
//
//    private ExpensesDTO mapToDTO(Expense expense) {
//
//        return modelMapper.map(expense, ExpensesDTO.class);
//
//    }
//}

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
        ExpensesDTO expenseDTO = modelMapper.map(expense, ExpensesDTO.class);
        expenseDTO.setDateString(DateTimeUtil.convertDateToString(expenseDTO.getDate()));
        return expenseDTO;
    }
}

