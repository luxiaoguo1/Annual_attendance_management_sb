package com.itlxg.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Quarterlystatistics {
    @TableId
    private Integer quarter_stat_id;
    private Integer employee_id;
    private LocalDate start_date;
    private LocalDate end_date;
    private float working_days;
    private Integer overtime_days;
    private Integer leave_count;
    private Integer year;
    private String quarter;
}
