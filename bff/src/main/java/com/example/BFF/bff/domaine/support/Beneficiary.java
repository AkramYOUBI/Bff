package com.example.BFF.bff.domaine.support;

import lombok.*;

import javax.persistence.Embeddable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
public class Beneficiary {
    private String beneficiary_id;
    private String beneficiary_groupId;
    private String beneficiary_name;
    private String beneficiary_address;
    private String beneficiary_iban;
    private String beneficiary_bic;
    private String beneficiary_pays;
}
