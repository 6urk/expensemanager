package burk.daily.expensemanager.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExpensesDTO {

    private long id;
    private String expenseID;
    private String expenseName;
    private String description;
    private BigDecimal amount;
    private Date    date;
    private String dateString;



}
