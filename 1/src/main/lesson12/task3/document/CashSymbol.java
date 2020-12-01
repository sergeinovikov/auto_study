package main.lesson12.task3.document;

import java.util.Objects;

public class CashSymbol {
    private int id;
    private Object version;
    private String code;
    private String name;
    private Object isExpense;
    private Object weight;

    public int getId() {
        return id;
    }

    public Object getVersion() {
        return version;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Object getIsExpense() {
        return isExpense;
    }

    public Object getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CashSymbol that = (CashSymbol) o;

        if (id != that.id) return false;
        if (!Objects.equals(version, that.version)) return false;
        if (!Objects.equals(code, that.code)) return false;
        if (!Objects.equals(name, that.name)) return false;
        if (!Objects.equals(isExpense, that.isExpense)) return false;
        return Objects.equals(weight, that.weight);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (isExpense != null ? isExpense.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        return result;
    }
}
