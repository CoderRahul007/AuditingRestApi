package com.AuditingRestApi.Auditing.repository.schedule;

import com.AuditingRestApi.Auditing.collections.Request;
import com.AuditingRestApi.Auditing.collections.Schedule;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ScheduleRepository extends MongoRepository<Schedule, String> {
}
