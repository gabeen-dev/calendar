package com.calendar.calendar.repository;

import com.calendar.calendar.model.dto.ScheduleRequest;
import com.calendar.calendar.model.entity.Schedule;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarScheduleRepository {

    Schedule findById(Long scheduleId);

    Schedule save(Schedule schedule);

    Schedule update(Long scheduleId, ScheduleRequest scheduleRequest);

    void deleteById(Long id);
}
