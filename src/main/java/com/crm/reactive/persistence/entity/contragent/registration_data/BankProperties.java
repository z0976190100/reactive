package com.crm.reactive.persistence.entity.contragent.registration_data;

public class BankProperties {

   private long id;
   private final String FACILITY_ACCOUNT;
   private final String BANK_TITLE;
   private final String CORRESPONDENT_BANK_ACCOUNT;
   private final String BIK;

    public BankProperties(String FACILITY_ACCOUNT,
                          String BANK_TITLE,
                          String CORRESPONDENT_BANK_ACCOUNT,
                          String BIK) {
        this.FACILITY_ACCOUNT = FACILITY_ACCOUNT;
        this.BANK_TITLE = BANK_TITLE;
        this.CORRESPONDENT_BANK_ACCOUNT = CORRESPONDENT_BANK_ACCOUNT;
        this.BIK = BIK;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFACILITY_ACCOUNT() {
        return FACILITY_ACCOUNT;
    }

    public String getBANK_TITLE() {
        return BANK_TITLE;
    }

    public String getCORRESPONDENT_BANK_ACCOUNT() {
        return CORRESPONDENT_BANK_ACCOUNT;
    }

    public String getBIK() {
        return BIK;
    }
}
