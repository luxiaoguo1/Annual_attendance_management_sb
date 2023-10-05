package com.itlxg.controller;

import com.itlxg.dao.EmployeeDao;
import com.itlxg.domain.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    EmployeeDao employeeDao;

    @GetMapping("/{id}")
    public void test(@PathVariable Integer id) {
        try {
            Employees employees = employeeDao.selectById(id);
            if (employees != null) {
                System.out.println(employees);
            } else {
                System.out.println("No employee found with ID: " + id);
            }
        } catch (Exception e) {
            // 捕获并处理异常
            e.printStackTrace();
            System.out.println("An error occurred while fetching employee data.");
        }
    }
}

