package com.AuditingRestApi.Auditing.repository;

import com.AuditingRestApi.Auditing.collections.Auditors;
import com.AuditingRestApi.Auditing.collections.OnsiteSchedule;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OnsiteScheduleRepository extends MongoRepository<OnsiteSchedule, String> {
}
