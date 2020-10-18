package main.lesson6.task4;

public enum IdentityDocumentType {
    MILITARY_ID("07", "Военный билет"),
    DIPLOMATIC_PASSPORT("09", "Дипломатический паспорт"),
    FOREIGN_PASSPORT("10", "Паспорт иностранного гражданина"),
    RUSSIAN_ID("21", "Паспорт гражданина Российской федерации"),
    RUSSIAN_PASSPORT("22", "Загранпаспорт гражданина Российской Федерации");

    private String code;
    private String description;

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    IdentityDocumentType(String code, String description) {
        this.code = code;
        this.description = description;
    }

}
