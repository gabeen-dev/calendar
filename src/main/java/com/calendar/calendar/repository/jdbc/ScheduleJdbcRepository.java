package com.calendar.calendar.repository.jdbc;

import com.calendar.calendar.model.dto.ScheduleRequest;
import com.calendar.calendar.model.entity.Schedule;
import com.calendar.calendar.repository.CalendarScheduleRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("jdbc")
@Component
public class ScheduleJdbcRepository implements CalendarScheduleRepository {

    @Override
    public Schedule findById(Long scheduleId) {
        return Schedule.builder()
                .createBy("createBy jdbc")
                .build();
    }

    @Override
    public Schedule save(Schedule schedule) {
        return null;
    }

    @Override
    public Schedule update(Long scheduleId, ScheduleRequest scheduleRequest) {
        return null;
    }

    @Override
    public void deleteById(Long id) {
    }
}
