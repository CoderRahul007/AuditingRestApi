package com.AuditingRestApi.Auditing.services.auditReports;

import com.AuditingRestApi.Auditing.repository.AuditReportsRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AuditReportsServiceImpl {
    @Autowired
    private AuditReportsRepository auditReportsRepository;
}
