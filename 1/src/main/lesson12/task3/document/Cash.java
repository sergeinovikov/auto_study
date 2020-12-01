package main.lesson12.task3.document;

import java.util.Objects;

public class Cash {
    private Object id;
    private Object version;
    private Object currencyNumericCodeIso;
    private double nominal;
    private String description;
    private Boolean isCoin;

    public Object getId() {
        return id;
    }

    public Object getVersion() {
        return version;
    }

    public Object getCurrencyNumericCodeIso() {
        return currencyNumericCodeIso;
    }

    public double getNominal() {
        return nominal;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getCoin() {
        return isCoin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cash cash = (Cash) o;

        if (Double.compare(cash.nominal, nominal) != 0) return false;
        if (!Objects.equals(id, cash.id)) return false;
        if (!Objects.equals(version, cash.version)) return false;
        if (!Objects.equals(currencyNumericCodeIso, cash.currencyNumericCodeIso))
            return false;
        if (!Objects.equals(description, cash.description)) return false;
        return Objects.equals(isCoin, cash.isCoin);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id != null ? id.hashCode() : 0;
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (currencyNumericCodeIso != null ? currencyNumericCodeIso.hashCode() : 0);
        temp = Double.doubleToLongBits(nominal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (isCoin != null ? isCoin.hashCode() : 0);
        return result;
    }
}
