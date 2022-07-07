package com.example.BFF.bff.domaine.support;

import lombok.*;

import javax.persistence.Embeddable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
public class Company {
    private String company_id;
    private String company_reference;
    private String company_swiftCode;
}
