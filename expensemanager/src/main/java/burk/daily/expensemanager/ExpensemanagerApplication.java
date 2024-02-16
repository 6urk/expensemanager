package burk.daily.expensemanager;


import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExpensemanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpensemanagerApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
// Path: expensemanager/src/main/java/burk/daily/expensemanager/ExpensemanagerApplication.java