package com.AuditingRestApi.Auditing.services.client;

import com.AuditingRestApi.Auditing.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ClientServiceImpl {
    @Autowired
    private ClientRepository clientRepository;
}
