package com.calendar.calendar.repository.jpa;

import com.calendar.calendar.model.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
}
