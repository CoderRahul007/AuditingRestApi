package com.AuditingRestApi.Auditing.collections;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Request")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Request {
    @Id
    private String id;
    private String clientId;
    private String leadAuditorId;
    private List<String> otherAuditorsId;
    private RequestDetails requestDetails;
    private TargetDate date;
    private Integer price;
    private Status status;
    private String artifacts;// BLOB need to change the type
    private ArtifactStatus artifactStatus;
    private String auditType;
    private Boolean isOnsite;

}

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
class TargetDate {
    private Date startDate;
    private Date endDate;
}

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
class  RequestDetails {
    private String industry;
    private  String description;
}

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
class ArtifactStatus {
    private Status status;
    private String reviewComments;
}

enum Status {
    PENDING,
    ACCEPTED,
    REJECTED;
}
