package main.lesson8.task3.Terminals;

public enum Owner {
    QIWI ("Киви"),
    ELEKSNET ("Элекснет"),
    TINKOFF ("Тинькофф");

    private String descriprion;

    Owner(String descriprion) {
        this.descriprion = descriprion;
    }

    public String getDescriprion() {
        return descriprion;
    }
}
