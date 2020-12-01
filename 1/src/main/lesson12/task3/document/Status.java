package main.lesson12.task3.document;

import java.util.Objects;

public class Status {
    private final String base;
    private final String name;
    private final Object extended;
    private final Object extendedName;
    private final Object comment;

    public Status(String base, String name, Object extended, Object extendedName, Object comment) {
        this.base = base;
        this.name = name;
        this.extended = extended;
        this.extendedName = extendedName;
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Status status = (Status) o;

        if (!Objects.equals(base, status.base)) return false;
        if (!Objects.equals(name, status.name)) return false;
        if (!Objects.equals(extended, status.extended)) return false;
        if (!Objects.equals(extendedName, status.extendedName))
            return false;
        return Objects.equals(comment, status.comment);
    }

    @Override
    public int hashCode() {
        int result = base != null ? base.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (extended != null ? extended.hashCode() : 0);
        result = 31 * result + (extendedName != null ? extendedName.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        return result;
    }
}
