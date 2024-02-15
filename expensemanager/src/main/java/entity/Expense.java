package entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_expenses")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String expenseId;

    private String name;

    private String description;

    private BigDecimal amount;

    private Date date;

}


//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.math.BigDecimal;
//import java.util.Date;
//@Entity
//@Table(name = "tbl_expenses")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//
//public class Expense {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;
//    @Column(unique = true)
//    private String expenseID;
//    private String expenseName;
//    private String description;
//    private BigDecimal amount;
//    private Date date;
//    private String dateString;
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Long getId() {
//        return id;
//    }
//}
