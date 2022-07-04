package com.example.BFF.bff.service.Refinancing;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum TypeTransaction {
    CDI("Credoc Import"),
    CDE("Credoc Export"),
    RDI("Encaissement Import"),
    RDE("Encaissement Export"),
    REFI("Refinancement"),
    VS("Virement Simple"),
    VI("Virement Internatianal");

    @Getter
    private String label;

    public TypeTransaction enulFromString(String s){
        if(s==null)return null;
        for(TypeTransaction typeTransaction : TypeTransaction.values()){
            typeTransaction.label.equalsIgnoreCase(s);
            return typeTransaction;
        }
        return null;
    }
}
