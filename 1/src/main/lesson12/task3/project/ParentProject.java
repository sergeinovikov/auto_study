package main.lesson12.task3.project;

import java.util.Arrays;
import java.util.Objects;

public class ParentProject {
    private int id;
    private String startDate;
    private String endDate;
    private String name;
    private int[] childIds;
    private Permissions[] permissions;
    private ParentProject parentProject;

    public int getId() {
        return id;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getName() {
        return name;
    }

    public int[] getChildIds() {
        return childIds;
    }

    public Permissions[] getPermissions() {
        return permissions;
    }

    public ParentProject getParentProject() {
        return parentProject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ParentProject that = (ParentProject) o;

        if (id != that.id) return false;
        if (!Objects.equals(startDate, that.startDate)) return false;
        if (!Objects.equals(endDate, that.endDate)) return false;
        if (!Objects.equals(name, that.name)) return false;
        if (!Arrays.equals(childIds, that.childIds)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(permissions, that.permissions)) return false;
        return Objects.equals(parentProject, that.parentProject);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(childIds);
        result = 31 * result + Arrays.hashCode(permissions);
        result = 31 * result + (parentProject != null ? parentProject.hashCode() : 0);
        return result;
    }
}
