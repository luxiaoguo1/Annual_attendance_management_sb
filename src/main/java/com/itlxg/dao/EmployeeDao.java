package com.itlxg.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itlxg.domain.Employees;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface EmployeeDao extends BaseMapper<Employees> {
    @Select("select * from employees")
    public List<Employees> selectAllEmployee();

    @Select("select * from employees where employee_id = #{employee_id}")
    public Employees selEmpId(Integer employee_id);
}
