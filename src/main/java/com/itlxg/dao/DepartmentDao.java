package com.itlxg.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itlxg.domain.Departments;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DepartmentDao extends BaseMapper<Departments> {
    @Select("select * from departments")
    public List<Departments> selectAllDepartment();


}
