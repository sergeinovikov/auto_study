package main.lesson12.task3.document;

import java.util.Objects;

public class Currency {
    private final int id;
    private final int version;
    private final String alphabeticCode;
    private final String numericCode;
    private final String okvName;

    public Currency(int id, int version, String alphabeticCode, String numericCode, String okvName) {
        this.id = id;
        this.version = version;
        this.alphabeticCode = alphabeticCode;
        this.numericCode = numericCode;
        this.okvName = okvName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Currency currency = (Currency) o;

        if (id != currency.id) return false;
        if (version != currency.version) return false;
        if (!Objects.equals(alphabeticCode, currency.alphabeticCode))
            return false;
        if (!Objects.equals(numericCode, currency.numericCode))
            return false;
        return Objects.equals(okvName, currency.okvName);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + version;
        result = 31 * result + (alphabeticCode != null ? alphabeticCode.hashCode() : 0);
        result = 31 * result + (numericCode != null ? numericCode.hashCode() : 0);
        result = 31 * result + (okvName != null ? okvName.hashCode() : 0);
        return result;
    }
}
