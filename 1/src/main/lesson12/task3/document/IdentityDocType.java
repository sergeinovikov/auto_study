package main.lesson12.task3.document;

import java.util.Objects;

public class IdentityDocType {
    private int id;
    private int version;
    private int code;
    private Name name;
    private String seriesPresence;
    private String issueSubdivisionPresence;

    public int getId() {
        return id;
    }

    public int getVersion() {
        return version;
    }

    public int getCode() {
        return code;
    }

    public Name getName() {
        return name;
    }

    public String getSeriesPresence() {
        return seriesPresence;
    }

    public String getIssueSubdivisionPresence() {
        return issueSubdivisionPresence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdentityDocType that = (IdentityDocType) o;

        if (id != that.id) return false;
        if (version != that.version) return false;
        if (code != that.code) return false;
        if (!Objects.equals(name, that.name)) return false;
        if (!Objects.equals(seriesPresence, that.seriesPresence))
            return false;
        return Objects.equals(issueSubdivisionPresence, that.issueSubdivisionPresence);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + version;
        result = 31 * result + code;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (seriesPresence != null ? seriesPresence.hashCode() : 0);
        result = 31 * result + (issueSubdivisionPresence != null ? issueSubdivisionPresence.hashCode() : 0);
        return result;
    }
}
