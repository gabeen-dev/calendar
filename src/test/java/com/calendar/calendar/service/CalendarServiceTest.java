package com.calendar.calendar.service;

import com.calendar.calendar.model.entity.Schedule;
import com.calendar.calendar.repository.jpa.ScheduleRepository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.time.LocalDateTime;


@ActiveProfiles("jdbc")
@Transactional
@SpringBootTest
class CalendarServiceTest {

    @Autowired
    CalendarService calendarService;
    @Autowired
    ScheduleRepository repository;
    @Autowired
    EntityManager em;

    @Test
    void test() {
        Schedule schedule = Schedule.builder()
                .createBy("lizzy")
                .password("password")
                .createDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();

        Schedule save = repository.save(schedule);

        em.flush();
        em.clear();

        Schedule schedule1 = repository.findById(save.getScheduleId()).get();
        System.out.println("schedule1 = " + schedule1);
    }
}