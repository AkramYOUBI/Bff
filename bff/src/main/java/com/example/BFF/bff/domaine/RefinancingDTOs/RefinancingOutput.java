package com.example.BFF.bff.domaine.RefinancingDTOs;

import com.example.BFF.bff.domaine.support.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Date;
@Getter
@Setter
@RequiredArgsConstructor
public class RefinancingOutput {
        private String id;
        private String reference;
        private String clientReference;
        private String bankReference;
        @Enumerated(EnumType.STRING)
        //to save the enumeration in the D.B as a String
        private TypeTransaction typeTransaction;
        private Double amount;
        @Enumerated(EnumType.STRING)
        private Devise currency;
        @DateTimeFormat(pattern ="dd-mm-yyyy")
        private Date startDate;
        @DateTimeFormat(pattern ="dd-mm-yyyy")
        private Date maturityDate;
        private Beneficiary beneficiary;
        private Company company;
        private Document document;
        private Date created_at;
}
