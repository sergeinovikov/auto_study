package main.lesson12.task3.document;

import java.util.Objects;

public class Account {
    private int id;
    private int version;
    private String accountNumber;
    private String bic;
    private Branch branch;

    public int getId() {
        return id;
    }

    public int getVersion() {
        return version;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getBic() {
        return bic;
    }

    public Branch getBranch() {
        return branch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (id != account.id) return false;
        if (version != account.version) return false;
        if (!Objects.equals(accountNumber, account.accountNumber))
            return false;
        if (!Objects.equals(bic, account.bic)) return false;
        return Objects.equals(branch, account.branch);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + version;
        result = 31 * result + (accountNumber != null ? accountNumber.hashCode() : 0);
        result = 31 * result + (bic != null ? bic.hashCode() : 0);
        result = 31 * result + (branch != null ? branch.hashCode() : 0);
        return result;
    }
}
