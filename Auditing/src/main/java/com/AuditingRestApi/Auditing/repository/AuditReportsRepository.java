package com.AuditingRestApi.Auditing.repository;

import com.AuditingRestApi.Auditing.collections.AuditReports;
import com.AuditingRestApi.Auditing.collections.Auditors;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuditReportsRepository extends MongoRepository<AuditReports, String> {
}
