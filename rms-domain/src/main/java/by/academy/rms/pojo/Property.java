package by.academy.rms.pojo;

import java.io.Serializable;
import java.util.Set;

public class Property implements Serializable{
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private String defaultValue;
    private LangCode defaultLangCode;
    private Set<PageProperty> pageProperties;

    public Property(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LangCode getDefaultLangCode() {
        return defaultLangCode;
    }

    public void setDefaultLangCode(LangCode defaultLangCode) {
        this.defaultLangCode = defaultLangCode;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<PageProperty> getPageProperties() {
        return pageProperties;
    }

    public void setPageProperties(Set<PageProperty> pageProperties) {
        this.pageProperties = pageProperties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Property property = (Property) o;

        if (defaultLangCode != null ? !defaultLangCode.equals(property.defaultLangCode) : property.defaultLangCode != null)
            return false;
        if (defaultValue != null ? !defaultValue.equals(property.defaultValue) : property.defaultValue != null)
            return false;
        if (id != null ? !id.equals(property.id) : property.id != null) return false;
        if (name != null ? !name.equals(property.name) : property.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (defaultValue != null ? defaultValue.hashCode() : 0);
        result = 31 * result + (defaultLangCode != null ? defaultLangCode.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Property{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", defaultValue='" + defaultValue + '\'' +
                ", defaultLangCode=" + defaultLangCode +
                ", pageProperties=" + "INSTEAD OF PAGE PROPERTIES" +// pageProperties +
                '}';
    }
}
