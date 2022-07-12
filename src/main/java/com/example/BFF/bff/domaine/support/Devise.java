package com.example.BFF.bff.domaine.support;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Devise {
    USD("USD"),
    EUR("EUR"),
    GBP("GBP"),
    CAD("CAD"),
    CHF("CHF"),
    DKK("DKK"),
    NOK("NOK"),
    SEK("SEK"),
    JPY("JPY"),
    CNY("CNY"),
    AED("AED"),
    DZD("DZD"),
    KWD("KWD"),
    LYD("LYD"),
    MRU("MRU"),
    SAR("SAR"),
    TND("TND"),
    EGP("EGP"),
    QAR("QAR"),
    OMR("OMR"),
    BHD("BHD"),
    GIP("GIP"),
    MAD("MAD"),
    CFA("CFA");

    public static Devise enumFromString(String s){
        if(s == null)return null;
        for(Devise devise : Devise.values()){
            if(devise.label.equalsIgnoreCase(s))return devise;
        }
        return null;
    }
    @Getter
    private String label;
}
