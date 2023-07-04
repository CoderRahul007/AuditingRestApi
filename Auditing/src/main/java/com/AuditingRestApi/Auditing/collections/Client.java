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
@Document(collection = "Client")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Client {
    @Id
    private String id;
    private String name;
    private String contactNumber;
    private Address address;
}
