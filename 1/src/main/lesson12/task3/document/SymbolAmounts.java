package main.lesson12.task3.document;

import java.util.Objects;

public class SymbolAmounts {
    private String amount;
    private CashSymbol cashSymbol;

    public String getAmount() {
        return amount;
    }

    public CashSymbol getCashSymbol() {
        return cashSymbol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SymbolAmounts that = (SymbolAmounts) o;

        if (!Objects.equals(amount, that.amount)) return false;
        return Objects.equals(cashSymbol, that.cashSymbol);
    }

    @Override
    public int hashCode() {
        int result = amount != null ? amount.hashCode() : 0;
        result = 31 * result + (cashSymbol != null ? cashSymbol.hashCode() : 0);
        return result;
    }
}
