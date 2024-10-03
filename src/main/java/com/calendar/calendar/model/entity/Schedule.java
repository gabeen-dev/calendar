package com.calendar.calendar.model.entity;

import com.calendar.calendar.model.dto.ScheduleRequest;
import com.calendar.calendar.model.dto.ScheduleResponse;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@ToString
@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Entity
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long scheduleId;

    @Column(updatable = false)
    private LocalDateTime createDate;

    @Column
    private LocalDateTime updateDate;

    @Column
    private String createBy;

    @Column
    private String password;

    @Column
    private String content;

    public ScheduleResponse converToResponse() {
        return ScheduleResponse.builder()
                .scheduleId(scheduleId)
                .createDate(createDate)
                .updateDate(updateDate)
                .createBy(createBy)
                .content(content)
                .build();
    }

    public void updateSchedule(ScheduleRequest scheduleRequest) {
        createDate = scheduleRequest.getCreateDate();
        updateDate = scheduleRequest.getUpdateDate();
        createBy = scheduleRequest.getCreateBy();
        content = scheduleRequest.getContent();
    }
}
