package uz.developers.model;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Currency implements Serializable {
    public int id;
    @SerializedName("Code")
    public String code;
    @SerializedName("Ccy")
    public String ccy;
    @SerializedName("CcyNm_RU")
    public String ccyNm_RU;
    @SerializedName("CcyNm_UZ")
    public String ccyNm_UZ;
    @SerializedName("CcyNm_UZC")
    public String ccyNm_UZC;
    @SerializedName("CcyNm_EN")
    public String ccyNm_EN;
    @SerializedName("Nominal")
    public String nominal;
    @SerializedName("Rate")
    public double rate;
    @SerializedName("Diff")
    public String diff;
    @SerializedName("Date")
    public String date;



    public Currency() {
    }

    public Currency(int id, String code, String ccy, String ccyNm_RU, String ccyNm_UZ, String ccyNm_UZC, String ccyNm_EN, String nominal, double rate, String diff, String date) {
        this.id = id;
        this.code = code;
        this.ccy = ccy;
        this.ccyNm_RU = ccyNm_RU;
        this.ccyNm_UZ = ccyNm_UZ;
        this.ccyNm_UZC = ccyNm_UZC;
        this.ccyNm_EN = ccyNm_EN;
        this.nominal = nominal;
        this.rate = rate;
        this.diff = diff;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    public String getCcyNm_RU() {
        return ccyNm_RU;
    }

    public void setCcyNm_RU(String ccyNm_RU) {
        this.ccyNm_RU = ccyNm_RU;
    }

    public String getCcyNm_UZ() {
        return ccyNm_UZ;
    }

    public void setCcyNm_UZ(String ccyNm_UZ) {
        this.ccyNm_UZ = ccyNm_UZ;
    }

    public String getCcyNm_UZC() {
        return ccyNm_UZC;
    }

    public void setCcyNm_UZC(String ccyNm_UZC) {
        this.ccyNm_UZC = ccyNm_UZC;
    }

    public String getCcyNm_EN() {
        return ccyNm_EN;
    }

    public void setCcyNm_EN(String ccyNm_EN) {
        this.ccyNm_EN = ccyNm_EN;
    }

    public String getNominal() {
        return nominal;
    }

    public void setNominal(String nominal) {
        this.nominal = nominal;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getDiff() {
        return diff;
    }

    public void setDiff(String diff) {
        this.diff = diff;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", ccy='" + ccy + '\'' +
                ", ccyNm_RU='" + ccyNm_RU + '\'' +
                ", ccyNm_UZ='" + ccyNm_UZ + '\'' +
                ", ccyNm_UZC='" + ccyNm_UZC + '\'' +
                ", ccyNm_EN='" + ccyNm_EN + '\'' +
                ", nominal='" + nominal + '\'' +
                ", rate='" + rate + '\'' +
                ", diff='" + diff + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
