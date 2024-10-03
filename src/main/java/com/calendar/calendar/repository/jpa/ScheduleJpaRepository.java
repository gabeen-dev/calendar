package com.calendar.calendar.repository.jpa;

import com.calendar.calendar.model.dto.ScheduleRequest;
import com.calendar.calendar.model.entity.Schedule;
import com.calendar.calendar.repository.CalendarScheduleRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Profile("jpa")
@Component
public class ScheduleJpaRepository implements CalendarScheduleRepository {

    public ScheduleJpaRepository(ScheduleRepository repository) {
        this.jpaRepository = repository;
    }

    private final ScheduleRepository jpaRepository;

    @Override
    public Schedule findById(Long scheduleId) {
        return jpaRepository.findById(scheduleId)
                .orElseThrow(() -> new RuntimeException("일정을 찾을 수 없습니다."));
    }

    @Override
    public Schedule save(Schedule schedule) {
        return jpaRepository.save(schedule);
    }

    @Override
    public Schedule update(Long scheduleId, ScheduleRequest scheduleRequest) {
        Schedule schedule = jpaRepository.findById(scheduleId)
                .orElseThrow(() -> new RuntimeException("일정을 찾을 수 없습니다."));
        schedule.updateSchedule(scheduleRequest);
        return schedule;
    }

    @Override
    public void deleteById(Long id) {
        jpaRepository.deleteById(id);
    }
}
