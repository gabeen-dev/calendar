package com.calendar.calendar.model.dto;

import com.calendar.calendar.model.entity.Schedule;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleRequest {

    private Long scheduleId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createDate;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateDate;

    private String content;
    private String createBy;

    public Schedule toEntity() {
        return Schedule.builder()
                .createDate(createDate)
                .updateDate(updateDate)
                .createBy(createBy)
                .content(content)
                .build();
    }
}

