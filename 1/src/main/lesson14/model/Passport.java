package main.lesson14.model;

public class Passport {
    private String series;
    private String number;
    private String issuer;
    private String issueDate;
    private String issuerCode;

    public Passport() {
    }

    public Passport(String series, String number, String issuer, String issueDate, String issuerCode) {
        this.series = series;
        this.number = number;
        this.issuer = issuer;
        this.issueDate = issueDate;
        this.issuerCode = issuerCode;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getIssuerCode() {
        return issuerCode;
    }

    public void setIssuerCode(String issuerCode) {
        this.issuerCode = issuerCode;
    }
}
