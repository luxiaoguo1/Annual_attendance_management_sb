package com.itlxg.domain;


import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Monthlystatistics {
    @TableId
    private Integer monthly_stat_id;
    private Integer employee_id;
    private LocalDate month;
    private Integer overtime_days;
    private Integer leave_count;
    private float working_days;


}
