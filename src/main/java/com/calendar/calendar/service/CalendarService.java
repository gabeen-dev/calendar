package com.calendar.calendar.service;

import com.calendar.calendar.model.dto.ScheduleRequest;
import com.calendar.calendar.model.dto.ScheduleResponse;
import com.calendar.calendar.model.entity.Schedule;
import com.calendar.calendar.repository.CalendarScheduleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CalendarService {

    private final CalendarScheduleRepository calendarScheduleRepository;

    public CalendarService(CalendarScheduleRepository calendarScheduleRepository) {
        this.calendarScheduleRepository = calendarScheduleRepository;
    }

    public Page<ScheduleResponse> searchSchedules(ScheduleRequest scheduleRequest) {
        return null;
    }

    public ScheduleResponse createSchedule(ScheduleRequest scheduleRequest) {
        return calendarScheduleRepository.save(scheduleRequest.toEntity())
                .converToResponse();
    }

    public ScheduleResponse searchSchedule(Long scheduleId) {
        return calendarScheduleRepository.findById(scheduleId)
                .converToResponse();
    }

    public ScheduleResponse updateSchedule(Long scheduleId, ScheduleRequest scheduleRequest) {
        Schedule updateSchedule = calendarScheduleRepository.update(scheduleId, scheduleRequest);
        return updateSchedule.converToResponse();
    }

    public void deleteSchedule(Long scheduleId) {
        calendarScheduleRepository.deleteById(scheduleId);
    }
}
