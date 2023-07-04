package com.AuditingRestApi.Auditing.services.requests;

import com.AuditingRestApi.Auditing.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class RequestServiceImpl {
    @Autowired
    private RequestRepository requestRepository;
}
