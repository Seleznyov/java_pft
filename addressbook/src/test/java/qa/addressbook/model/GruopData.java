package qa.addressbook.model;

import java.util.Objects;

public class GruopData {
    private  int id;
    private final String name;
    private final String header;
    private final String footer;

    public GruopData( String name, String header, String footer) {
        this.id=  Integer.MAX_VALUE;
        this.name = name;
        this.header = header;
        this.footer = footer;
    }
    public GruopData(int id, String name, String header, String footer) {
        this.id= id;
        this.name = name;
        this.header = header;
        this.footer = footer;
    }

    public GruopData withId(int id) {
        this.id = id;
        return this;
    }

    public int getId() { return id; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GruopData gruopData = (GruopData) o;
        return id == gruopData.id &&
                Objects.equals(name, gruopData.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "GruopData{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getHeader() {
        return header;
    }

    public String getFooter() {
        return footer;
    }

}
