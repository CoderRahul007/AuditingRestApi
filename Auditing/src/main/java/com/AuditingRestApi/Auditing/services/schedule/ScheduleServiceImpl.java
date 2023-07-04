package com.AuditingRestApi.Auditing.services.schedule;

import com.AuditingRestApi.Auditing.repository.schedule.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ScheduleServiceImpl {
    @Autowired
    private ScheduleRepository scheduleRepository;
}
