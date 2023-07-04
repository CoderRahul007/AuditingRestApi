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
@Document(collection = "Auditors")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Auditors {
    @Id
    private String id;
    private String name;
    private String email;
    private String contactNumber;
    private Address address;
    private List<String> expertise;
    private Integer experience;
    private List<String> industryKnowledge;
    private List<String> certifications;
    private Integer price;
    private Boolean isLeadAuditor;
    private Boolean onContract;

}

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
class Address {
    private String address1;
    private String address2;
    private String country;
    private String city;
    private String pincode;
}