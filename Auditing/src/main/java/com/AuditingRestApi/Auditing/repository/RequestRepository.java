package com.AuditingRestApi.Auditing.repository;

import com.AuditingRestApi.Auditing.collections.Request;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RequestRepository extends MongoRepository<Request, String> {
}
