package com.itlxg.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Attendance {

    @TableId
    private Integer attendance_id;
    private Integer employee_id;

    private String attendance_date;

    private String morning_status;
    private String afternoon_status;
    private Integer is_leave;
    private Integer is_overtime;
    private String notes;

}
