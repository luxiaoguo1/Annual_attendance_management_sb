package com.itlxg.domain;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("employees")
public class Employees {

    @TableId
    private Integer  employee_id;
    private String employee_name;
    private Integer department_id;
}
