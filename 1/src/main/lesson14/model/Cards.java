package main.lesson14.model;

public class Cards {
    private String type;
    private String cardNumber;
    private String endDateMonth;
    private String endDateYear;
    private String code;
    private String accountNumber;

    public Cards() {
    }

    public Cards(String type, String cardNumber, String endDateMonth, String endDateYear, String code, String accountNumber) {
        this.type = type;
        this.cardNumber = cardNumber;
        this.endDateMonth = endDateMonth;
        this.endDateYear = endDateYear;
        this.code = code;
        this.accountNumber = accountNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getEndDateMonth() {
        return endDateMonth;
    }

    public void setEndDateMonth(String endDateMonth) {
        this.endDateMonth = endDateMonth;
    }

    public String getEndDateYear() {
        return endDateYear;
    }

    public void setEndDateYear(String endDateYear) {
        this.endDateYear = endDateYear;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
