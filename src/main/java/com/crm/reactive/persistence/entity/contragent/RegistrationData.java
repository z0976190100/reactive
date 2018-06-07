package com.crm.reactive.persistence.entity.contragent;

import com.crm.reactive.persistence.entity.contragent.registration_data.Address;
import com.crm.reactive.persistence.entity.contragent.registration_data.BankProperties;

import java.util.List;

public class RegistrationData {

    private long id;
    private String fullTitle;
    private List<Address> addresses;
    private BankProperties bankProperties;
    private final String INN;
    private final String KPP;
    private final String OGRN;
    private final String OKVED;
    private final String OKPO;

    public RegistrationData(String fullTitle,
                            List<Address> addresses,
                            BankProperties bankProperties,
                            String INN,
                            String KPP,
                            String OGRN,
                            String OKVED,
                            String OKPO) {
        this.fullTitle = fullTitle;
        this.addresses = addresses;
        this.bankProperties = bankProperties;
        this.INN = INN;
        this.KPP = KPP;
        this.OGRN = OGRN;
        this.OKVED = OKVED;
        this.OKPO = OKPO;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullTitle() {
        return fullTitle;
    }

    public void setFullTitle(String fullTitle) {
        this.fullTitle = fullTitle;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public BankProperties getBankProperties() {
        return bankProperties;
    }

    public void setBankProperties(BankProperties bankProperties) {
        this.bankProperties = bankProperties;
    }

    public String getINN() {
        return INN;
    }

    public String getKPP() {
        return KPP;
    }

    public String getOGRN() {
        return OGRN;
    }

    public String getOKVED() {
        return OKVED;
    }

    public String getOKPO() {
        return OKPO;
    }
}
