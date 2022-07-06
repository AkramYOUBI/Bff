package com.example.BFF.bff.domaine.entities;

import com.example.BFF.bff.domaine.support.Document;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
//this is a persistence class because it's created in the d.b as an entity
public class Refinancing {
    private String reference;
    private String clientReference;
    private String bankReference;
    @Enumerated(EnumType.STRING)
    //to save the enumeration in the D.B as a String
    private String typeTransaction;
    private Double amount;
    @Enumerated(EnumType.STRING)
    private String currency;
    @DateTimeFormat(pattern ="dd-mm-yyyy")
    private Date startDate;
    @DateTimeFormat(pattern ="dd-mm-yyyy")
    private Date maturityDate;

    private String beneficiary;

    private String company;

    private Document document;
}
