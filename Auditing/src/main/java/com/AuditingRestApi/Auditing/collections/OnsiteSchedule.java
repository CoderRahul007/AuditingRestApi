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
@Document(collection = "Onsite_Schedule")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OnsiteSchedule {
    @Id
    private String requestId;
    private String clientId;
    private String leadAuditorId;
    private List<String> otherAuditorIds;
    private Date date;
    private Address accomodationAddress;
}


