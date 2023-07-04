package com.AuditingRestApi.Auditing.collections;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Schedule")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Schedule {
    @Id
    private String requestId;
    private String auditorId;
    private ScheduleTime schedule;
    private String clientId;

}


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
class ScheduleTime {
    private String startTime;
    private String endTime;
}