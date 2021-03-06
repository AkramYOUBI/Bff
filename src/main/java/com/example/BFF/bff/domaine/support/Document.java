package com.example.BFF.bff.domaine.support;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Document {
    private String numFacture;
    private Date dateFacture;
    private String titreImportation;
    private Date dateImportation;
}
