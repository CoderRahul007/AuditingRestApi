package com.AuditingRestApi.Auditing.repository;

import com.AuditingRestApi.Auditing.collections.Auditors;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditorRepository extends MongoRepository<Auditors, String> {
}

