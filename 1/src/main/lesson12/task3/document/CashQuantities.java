package main.lesson12.task3.document;

import java.util.Objects;

public class CashQuantities {
    private int quantity;
    private Cash cash;

    public int getQuantity() {
        return quantity;
    }

    public Cash getCash() {
        return cash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CashQuantities that = (CashQuantities) o;

        if (quantity != that.quantity) return false;
        return Objects.equals(cash, that.cash);
    }

    @Override
    public int hashCode() {
        int result = quantity;
        result = 31 * result + (cash != null ? cash.hashCode() : 0);
        return result;
    }
}
