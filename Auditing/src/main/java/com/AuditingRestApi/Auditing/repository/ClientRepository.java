package com.AuditingRestApi.Auditing.repository;

import com.AuditingRestApi.Auditing.collections.Auditors;
import com.AuditingRestApi.Auditing.collections.Client;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepository extends MongoRepository<Client, String> {
}
