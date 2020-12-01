package main.lesson12.task3.document;

import java.util.Objects;

public class Branch {
    private int id;
    private int version;
    private Object headBranch;
    private Object bic;
    private String shortName;
    private String timeZone;
    private Object branchAddresses;
    private Boolean currencyTrifle;
    private String code_TFU;

    public int getId() {
        return id;
    }

    public int getVersion() {
        return version;
    }

    public Object getHeadBranch() {
        return headBranch;
    }

    public Object getBic() {
        return bic;
    }

    public String getShortName() {
        return shortName;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public Object getBranchAddresses() {
        return branchAddresses;
    }

    public Boolean getCurrencyTrifle() {
        return currencyTrifle;
    }

    public String getCode_TFU() {
        return code_TFU;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Branch branch = (Branch) o;

        if (id != branch.id) return false;
        if (version != branch.version) return false;
        if (!Objects.equals(headBranch, branch.headBranch)) return false;
        if (!Objects.equals(bic, branch.bic)) return false;
        if (!Objects.equals(shortName, branch.shortName)) return false;
        if (!Objects.equals(timeZone, branch.timeZone)) return false;
        if (!Objects.equals(branchAddresses, branch.branchAddresses))
            return false;
        if (!Objects.equals(currencyTrifle, branch.currencyTrifle))
            return false;
        return Objects.equals(code_TFU, branch.code_TFU);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + version;
        result = 31 * result + (headBranch != null ? headBranch.hashCode() : 0);
        result = 31 * result + (bic != null ? bic.hashCode() : 0);
        result = 31 * result + (shortName != null ? shortName.hashCode() : 0);
        result = 31 * result + (timeZone != null ? timeZone.hashCode() : 0);
        result = 31 * result + (branchAddresses != null ? branchAddresses.hashCode() : 0);
        result = 31 * result + (currencyTrifle != null ? currencyTrifle.hashCode() : 0);
        result = 31 * result + (code_TFU != null ? code_TFU.hashCode() : 0);
        return result;
    }
}
