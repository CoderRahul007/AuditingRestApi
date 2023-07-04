package com.AuditingRestApi.Auditing.collections;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Audit_Reports")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditReports {
    @Id
    private String requestId;
    private String clientId;
    private String leadAuditorId;
    private List<String> otherAuditorIds;
    private String reports;// BLOB
    private List<String> certifications; // need to think the type
    private AuditStatus auditStatus;

}

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
class AuditStatus {
    private Status status;
    private String reviewComments;
    private List<String> comments;
}