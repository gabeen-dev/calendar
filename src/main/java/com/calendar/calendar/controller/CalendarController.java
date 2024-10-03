package com.calendar.calendar.controller;

import com.calendar.calendar.model.dto.ScheduleRequest;
import com.calendar.calendar.model.dto.ScheduleResponse;
import com.calendar.calendar.service.CalendarService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class CalendarController {

    private final CalendarService calendarService;

    public CalendarController(CalendarService calendarService) {
        this.calendarService = calendarService;
    }

    //일정조회
    @GetMapping("/api/schedule/search")
    public Page<ScheduleResponse> searchSchedules(@RequestBody ScheduleRequest scheduleRequest) {
        return calendarService.searchSchedules(scheduleRequest);
    }
    //일정등록
    @PostMapping("/api/schedule")
    public ScheduleResponse createSchedule(@RequestBody ScheduleRequest scheduleRequest) {
        return calendarService.createSchedule(scheduleRequest);
    }
    //일정 단건조회
    @GetMapping("/api/schedule/{schedule-id}")
    public ScheduleResponse searchSchedule(@PathVariable("schedule-id") Long scheduleId) {
        return calendarService.searchSchedule(scheduleId);
    }
    //일정수정조회
    @PatchMapping("/api/schedule/{schedule-id}")
    public ScheduleResponse updateSchedule(@PathVariable("schedule-id") Long scheduleId, @RequestBody ScheduleRequest scheduleRequest) {
        return calendarService.updateSchedule(scheduleId, scheduleRequest);
    }
    //일정삭제
    @DeleteMapping("/api/schedule/{schedule-id}")
    public void deleteSchedule(@PathVariable("schedule-id") Long scheduleId) {
        calendarService.deleteSchedule(scheduleId);
    }
}
