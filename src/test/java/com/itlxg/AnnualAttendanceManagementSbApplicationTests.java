package com.itlxg;

import com.itlxg.dao.EmployeeDao;
import com.itlxg.domain.Employees;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class AnnualAttendanceManagementSbApplicationTests {

	@Autowired
	EmployeeDao employeeDao;
	@Test
	void selALlEmployee() {
		List<Employees> employeeslist= employeeDao.selectAllEmployee();
		System.out.println(employeeslist);



	}
	@Test
	void selEmployeeId() {
		Employees employees = employeeDao.selEmpId(3);
		System.out.println(employees);
	}

}
