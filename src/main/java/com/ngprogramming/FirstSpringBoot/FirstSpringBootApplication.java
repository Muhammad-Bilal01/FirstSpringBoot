package com.ngprogramming.FirstSpringBoot;

import com.ngprogramming.FirstSpringBoot.config.EmployeeProperties;
import com.ngprogramming.FirstSpringBoot.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@RequiredArgsConstructor
@Slf4j
public class FirstSpringBootApplication implements CommandLineRunner {

    @Autowired
    private EmployeeProperties employeeProperties;

    public static void main(String[] args) {

        SpringApplication.run(FirstSpringBootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
      log.info("Properties Configure : "+ employeeProperties.toString());
//        employeeService.printMessage("Extra Injection Example");
    }


//    Constructor
//    always add final in Constructor Dependency
//    private final EmployeeService employeeService;

//    public FirstSpringBootApplication(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }

//	Field Injection
//	@Autowired
//	private  EmployeeService employeeService;


//	Setter Injection
//
//	private EmployeeService employeeService;
//	@Autowired
//	public void setEmployeeService(EmployeeService employeeService){
//		this.employeeService = employeeService;
//	}

}
