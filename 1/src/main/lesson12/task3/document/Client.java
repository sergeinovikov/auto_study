package main.lesson12.task3.document;

import java.util.Objects;

public class Client {
    private int id;
    private int version;
    private String inn;
    private String shortName;
    private String ogrn;

    public Client(int id, int version, String inn, String shortName, String ogrn) {
        this.id = id;
        this.version = version;
        this.inn = inn;
        this.shortName = shortName;
        this.ogrn = ogrn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (id != client.id) return false;
        if (version != client.version) return false;
        if (!Objects.equals(inn, client.inn)) return false;
        if (!Objects.equals(shortName, client.shortName)) return false;
        return Objects.equals(ogrn, client.ogrn);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + version;
        result = 31 * result + (inn != null ? inn.hashCode() : 0);
        result = 31 * result + (shortName != null ? shortName.hashCode() : 0);
        result = 31 * result + (ogrn != null ? ogrn.hashCode() : 0);
        return result;
    }
}
