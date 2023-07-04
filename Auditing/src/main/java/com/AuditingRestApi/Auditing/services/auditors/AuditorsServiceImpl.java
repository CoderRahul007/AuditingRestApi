package com.AuditingRestApi.Auditing.services.auditors;

import com.AuditingRestApi.Auditing.repository.AuditorRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AuditorsServiceImpl {
    @Autowired
    private AuditorRepository auditorRepository;
}
